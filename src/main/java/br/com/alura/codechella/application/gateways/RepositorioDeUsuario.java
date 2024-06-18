package br.com.alura.codechella.application.gateways;


import br.com.alura.codechella.domain.entities.usuario.Usuario;
import jakarta.validation.Valid;

import java.util.List;

public interface RepositorioDeUsuario {

    Usuario cadastrarUsuario(@Valid Usuario usuario);

    List<Usuario> listarTodos();

}
