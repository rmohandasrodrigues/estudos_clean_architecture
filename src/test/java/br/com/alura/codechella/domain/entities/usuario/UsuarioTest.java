package br.com.alura.codechella.domain.entities.usuario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UsuarioTest {
    @Test
    public void naoDeveCadastrarUsuarioComCpfNoFormatoInvalido(){
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario( "12345678-99", "Raphael", LocalDate.parse("1984-09-14"),
                        "rwmtecnologia@gmail.com"));
    }

    @Test
    public void naoDeveCadastrarUsuarioComNomeNulo(){
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario("12345678-99", "", LocalDate.parse("1984-09-14"), "teste@teste.com"));
    }

    @Test
    public void deveCriarUsuarioUsandoFabricaDeUsuario(){

        FabricaDeUsuario fabrica = new FabricaDeUsuario();
        Usuario usuario = fabrica.comNomeCpfNascimento("Raphael", "725.249.281-87", LocalDate.parse("1984-09-14"));
        Assertions.assertEquals("Raphael", usuario.getNome());

        usuario = fabrica.incluiEndereco("12345-999", 40, "apto 201");

        Assertions.assertEquals("apto 201", usuario.getEndereco().getComplemento());

    }




}
