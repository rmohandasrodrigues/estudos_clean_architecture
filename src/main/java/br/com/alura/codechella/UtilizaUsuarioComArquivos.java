package br.com.alura.codechella;

import br.com.alura.codechella.domain.entities.usuario.Usuario;
import br.com.alura.codechella.infra.gateways.RepositorioDeUsuarioEmArquivo;

import java.time.LocalDate;

public class UtilizaUsuarioComArquivos {
    public static void main(String[] args){
        RepositorioDeUsuarioEmArquivo repositorioDeUsuarioEmArquivo = new RepositorioDeUsuarioEmArquivo();

        repositorioDeUsuarioEmArquivo.cadastrarUsuario(new Usuario("725.249.281-87", "Raphael Mohandas",
                LocalDate.parse("1984-09-14"), "rwmtecnologia@gmail.com"));

        repositorioDeUsuarioEmArquivo.cadastrarUsuario(new Usuario("725.249.281-87", "Raphael Mohandas",
                LocalDate.parse("1984-09-14"), "rwmtecnologia@gmail.com"));

        repositorioDeUsuarioEmArquivo.cadastrarUsuario(new Usuario("725.249.281-87", "Raphael Mohandas",
                LocalDate.parse("1984-09-14"), "rwmtecnologia@gmail.com"));

        repositorioDeUsuarioEmArquivo.cadastrarUsuario(new Usuario("725.249.281-87", "Raphael Mohandas",
                LocalDate.parse("1984-09-14"), "rwmtecnologia@gmail.com"));

        //System.out.println(repositorioDeUsuarioEmArquivo.listarTodos());
        repositorioDeUsuarioEmArquivo.gravaEmArquivo("usuarios.txt");

    }
}
