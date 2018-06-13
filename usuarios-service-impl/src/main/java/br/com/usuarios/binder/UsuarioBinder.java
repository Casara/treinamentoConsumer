package br.com.usuarios.binder;

import br.com.usuarios.funcional.api.restclient.model.response.ConsultaUsuariosResponse;
import br.com.usuarios.model.Usuario;

public class UsuarioBinder {

    public static Usuario bindFrom(ConsultaUsuariosResponse consultaUsuariosResponse) {
        return Usuario.builder()
                .id(consultaUsuariosResponse.getId())
                .nome(consultaUsuariosResponse.getNome())
                .dataNascimento(consultaUsuariosResponse.getDataNascimento())
                .cpf(consultaUsuariosResponse.getCpf())
                .endereco(consultaUsuariosResponse.getEndereco())
                .build();
    }

}
