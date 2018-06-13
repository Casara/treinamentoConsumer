package br.com.usuarios;

import br.com.dimed.arch.DimedServicesRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAutoConfiguration
@EnableScheduling
@ComponentScan(basePackages = "br.com.usuarios")
public class Application {

    public static void main(String[] args) {
        new DimedServicesRunner(Application.class).run(args);
    }

}
