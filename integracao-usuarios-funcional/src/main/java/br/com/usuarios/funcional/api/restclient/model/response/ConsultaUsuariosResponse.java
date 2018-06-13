package br.com.usuarios.funcional.api.restclient.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConsultaUsuariosResponse {

    @JsonProperty("id")
    private int id;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("dataNascimento")
    private String dataNascimento;

    @JsonProperty("cpf")
    private String cpf;

    @JsonProperty("endereco")
    private String endereco;

}
