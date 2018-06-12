package br.com.usuarios.funcional.api.service;

import br.com.usuarios.funcional.api.restclient.model.ConsultaUsuariosRestClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiServiceModule {
    @Bean
    public ApiService consultaUsuariosApiService(ConsultaUsuariosRestClient restClient) {
        return new ApiService(restClient);
    }
}
