package br.com.usuarios.funcional.api.restclient.model;

import br.com.usuarios.funcional.api.common.handler.ErrorFuncionalHandler;
import br.com.usuarios.funcional.api.restclient.factory.ConsultaUsuariosRequestFactory;
import br.com.usuarios.funcional.api.restclient.model.response.ConsultaUsuariosResponse;
import lombok.AllArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@AllArgsConstructor
public class ConsultaUsuariosRestClient {
    private ConsultaUsuariosRequestFactory requestFactory;
    private RestTemplate restTemplate;

    public List<ConsultaUsuariosResponse> consultar() {
        restTemplate.setErrorHandler(new ErrorFuncionalHandler());

        HttpEntity<String> requestEntity = new HttpEntity<>(requestFactory.buildHttpHeaders());

        ResponseEntity<List<ConsultaUsuariosResponse>> responseEntity = restTemplate.exchange(
                requestFactory.buildUri(),
                HttpMethod.GET,
                requestEntity,
                new ParameterizedTypeReference<List<ConsultaUsuariosResponse>>() {});

        return responseEntity.getBody();
    }
}
