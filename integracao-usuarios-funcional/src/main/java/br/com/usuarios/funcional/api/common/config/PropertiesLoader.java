package br.com.usuarios.funcional.api.common.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class PropertiesLoader {

    @Value("${treinamento.api.url}")
    private String treinamentoUrl;

}
