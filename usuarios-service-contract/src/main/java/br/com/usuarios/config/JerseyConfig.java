package br.com.usuarios.config;

import br.com.dimed.arch.jersey.DefaulJerseyConfig;
import br.com.usuarios.contract.RestEndPoint;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@Api("/usuarios")
@ApplicationPath("treinamento")
public class JerseyConfig extends DefaulJerseyConfig {
    public JerseyConfig() {
        super();
        register(RestEndPoint.class);
    }
}
