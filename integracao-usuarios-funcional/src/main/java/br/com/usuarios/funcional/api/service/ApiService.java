package br.com.usuarios.funcional.api.service;

import br.com.usuarios.funcional.api.restclient.model.ConsultaUsuariosRestClient;
import br.com.usuarios.funcional.api.restclient.model.response.ConsultaUsuariosResponse;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ApiService {
    private ConsultaUsuariosRestClient consultaUsuariosRestClient;

    public List<ConsultaUsuariosResponse> consultaUsuarios() {
        return consultaUsuariosRestClient.consultar();
    }
}
