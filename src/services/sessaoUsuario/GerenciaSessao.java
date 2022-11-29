package services.sessaoUsuario;

import model.usuario.*;
import services.sessaoUsuario.SessaoDeUsuario;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class GerenciaSessao extends SessaoDeUsuario {
    public boolean loginUsuario(String email, String senha, ArrayList<Usuario> usuarios){
        Iterator<Usuario> iterator = usuarios.iterator();
        while(iterator.hasNext()){
            Usuario usuario = iterator.next();
            if(usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)){
                return true;
            }
        }

        return false;
    }

    //regra de negocio: apenas compradores e proprietarios se cadastram nesse sistema, os outros usuarios seriam cadastrados em um sistema para o administrador
    public ArrayList<Usuario> cadastrarProprietario(String nome, String email, String numeroTelefone, String cpf, Date dataNascimento, String senha, ArrayList<Usuario> usuarios){
        Proprietario proprietario = new Proprietario(nome, email, numeroTelefone, cpf, dataNascimento, senha);
        usuarios.add(proprietario);

        return usuarios;
    }

    public ArrayList<Usuario> cadastrarComprador(String nome, String email, String numeroTelefone, String cpf, Date dataNascimento, String senha, ArrayList<Usuario> usuarios){
        Comprador comprador = new Comprador(nome, email, numeroTelefone, cpf, dataNascimento, senha);
        usuarios.add(comprador);

        return usuarios;
    }
}
