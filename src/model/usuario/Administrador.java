package model.usuario;

import java.util.ArrayList;
import java.util.Date;

public class Administrador extends Usuario {
    public Administrador(String nome, String email, String numeroTelefone, String cpf, Date dataNascimento, String senha) {
        super(nome, email, numeroTelefone, cpf, dataNascimento, senha);
    }
}
