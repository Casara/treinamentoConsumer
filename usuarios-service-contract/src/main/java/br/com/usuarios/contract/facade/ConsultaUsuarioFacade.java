package br.com.usuarios.contract.facade;

import br.com.usuarios.service.UsuariosService;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ConsultaUsuarioFacade {
    UsuariosService usuariosService;

    public List<String> consultarNomes() {
        return usuariosService.consultarNomes();
    }

    public List<String> consultarNomesComFiltro(String s) {
        return usuariosService.consultarPorNome(s);
    }
}
