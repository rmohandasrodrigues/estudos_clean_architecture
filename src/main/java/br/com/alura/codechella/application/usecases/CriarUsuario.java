package br.com.alura.codechella.application.usecases;


import br.com.alura.codechella.application.gateways.RepositorioDeUsuario;
import br.com.alura.codechella.domain.entities.usuario.Usuario;
import jakarta.validation.Valid;

public class CriarUsuario {

    private final RepositorioDeUsuario repositorio;

    public CriarUsuario(RepositorioDeUsuario repositorio) {

        this.repositorio = repositorio;
    }

    public Usuario cadastrarUsuario(@Valid Usuario usuario) {

        return repositorio.cadastrarUsuario(usuario);
    }
}
