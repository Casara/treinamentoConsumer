package br.com.usuarios.funcional.api.restclient.factory;

import br.com.usuarios.funcional.api.common.config.PropertiesLoader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConsultaUsuariosRequestFactoryModule {

    @Bean
    public ConsultaUsuariosRequestFactory consultaUsuariosRequestFactory(PropertiesLoader propertiesLoader) {
        return new ConsultaUsuariosRequestFactory(propertiesLoader);
    }

}
