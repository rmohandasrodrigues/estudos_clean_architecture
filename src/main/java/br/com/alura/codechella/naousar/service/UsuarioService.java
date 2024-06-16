package br.com.alura.codechella.naousar.service;

import br.com.alura.codechella.naousar.model.Usuario;
import jakarta.validation.Valid;

import java.util.List;

public interface UsuarioService {
    Usuario cadastrarUsuario(@Valid Usuario usuario);

    List<Usuario> listarTodos();
}
