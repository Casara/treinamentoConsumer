package br.com.usuarios.service;

import br.com.usuarios.binder.UsuarioBinder;
import br.com.usuarios.funcional.api.service.ApiService;
import br.com.usuarios.model.Usuario;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;

@AllArgsConstructor
public class UsuariosService {

    ApiService apiService;

    public List<String> consultarNomes() {
        return apiService.consultaUsuarios()
                .stream()
                .map(usuario -> this.nomeUsuario().apply(UsuarioBinder.bindFrom(usuario)))
                .collect(Collectors.toList());
    }

    public List<String> consultarPorNome(String nome) {
        return apiService.consultaUsuarios()
                .stream()
                .filter(usuario -> this.filtroPorNome().test(UsuarioBinder.bindFrom(usuario), nome))
                .map(usuario -> this.nomeUsuario().apply(UsuarioBinder.bindFrom(usuario)))
                .collect(Collectors.toList());
    }

    private Function<Usuario, String> nomeUsuario() {
        return Usuario::getNome;
    }

    private BiPredicate<Usuario, String> filtroPorNome() {
        return ((usuario, s) -> usuario.getNome().equals(s));
    }

}
