package br.com.usuarios.funcional.api.restclient.factory;

import br.com.usuarios.funcional.api.common.config.PropertiesLoader;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

@AllArgsConstructor
public class ConsultaUsuariosRequestFactory {

    @Autowired
    private PropertiesLoader propertiesLoader;

    public String buildUri() {
        return propertiesLoader.getTreinamentoUrl();
    }

    public HttpHeaders buildHttpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }

}
