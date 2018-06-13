package br.com.usuarios.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Usuario {

    private int id;

    private String nome;

    private String dataNascimento;

    private String cpf;

    private String endereco;

}
