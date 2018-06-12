package br.com.usuarios.contract.facade;

import br.com.usuarios.service.UsuariosService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConsultaUsuarioFacadeModule {
    @Bean
    public ConsultaUsuarioFacade consultaUsuarioFacade(UsuariosService usuariosService) {
        return new ConsultaUsuarioFacade(usuariosService);
    }
}
