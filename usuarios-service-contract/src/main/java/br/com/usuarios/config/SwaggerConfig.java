package br.com.usuarios.config;

import io.swagger.jaxrs.config.BeanConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public BeanConfig swaggerBean() {
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setTitle("Documentação do serviço de usuários");
        beanConfig.setVersion("1.0.0");
        beanConfig.setBasePath("/usuarios");
        beanConfig.setResourcePackage("br.com.usuarios.contract");
        beanConfig.setScan(true);
        return beanConfig;
    }

}
