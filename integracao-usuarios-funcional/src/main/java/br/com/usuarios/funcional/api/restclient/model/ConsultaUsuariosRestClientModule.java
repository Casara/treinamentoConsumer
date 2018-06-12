package br.com.usuarios.funcional.api.restclient.model;

import br.com.usuarios.funcional.api.restclient.factory.ConsultaUsuariosRequestFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConsultaUsuariosRestClientModule {
    @Bean
    public ConsultaUsuariosRestClient consultaUsuariosRestClient(ConsultaUsuariosRequestFactory requestFactory,
                                                                 RestTemplate restTemplate) {
        return new ConsultaUsuariosRestClient(requestFactory, restTemplate);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
