package br.com.usuarios.funcional.api.common.handler;

import br.com.usuarios.funcional.api.common.exception.RestServiceErroNoClienteException;
import br.com.usuarios.funcional.api.common.exception.RestServiceErroUsuarioSenhaException;
import br.com.usuarios.funcional.api.common.exception.RestServiceIndisponivelException;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestClientException;

import java.io.IOException;

public class ErrorFuncionalHandler extends DefaultResponseErrorHandler {

    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
        HttpStatus statusCode = response.getStatusCode();
        switch (statusCode.series()) {
            case SERVER_ERROR:
                throw new RestServiceIndisponivelException("Serviço não disponível.");
            case CLIENT_ERROR:
                if (response.getStatusCode().equals(HttpStatus.UNAUTHORIZED))
                    throw new RestServiceErroUsuarioSenhaException("Login e/ou senha inválidos.");
                else if (response.getStatusCode().equals(HttpStatus.BAD_REQUEST))
                    throw new RestServiceErroNoClienteException("Os dados informados são inválidos.");
            default:
                throw new RestClientException("Erro desconhecido [" + statusCode + "]");
        }
    }

    @Override
    public boolean hasError(ClientHttpResponse clientHttpResponse) throws IOException {
        return clientHttpResponse.getStatusCode().series() == HttpStatus.Series.SERVER_ERROR ||
                clientHttpResponse.getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR;
    }

}
