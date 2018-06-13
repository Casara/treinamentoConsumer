package br.com.usuarios.service;

import br.com.usuarios.funcional.api.service.ApiService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsuariosServiceModule {

    @Bean
    public UsuariosService usuariosService(ApiService apiService) {
        return new UsuariosService(apiService);
    }

}
