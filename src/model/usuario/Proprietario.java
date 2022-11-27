package model.usuario;

import model.propriedade.Propriedade;

import java.util.ArrayList;
import java.util.Date;

public class Proprietario extends Usuario {
    private ArrayList<Propriedade> imoveis;

    public Proprietario(String nome, String email, String numeroTelefone, String cpf, Date dataNascimento, String senha) {
        super(nome, email, numeroTelefone, cpf, dataNascimento, senha);
        this.imoveis = new ArrayList<Propriedade>();
    }

    public ArrayList<Propriedade> getImoveis() {
        return imoveis;
    }

    public void setImoveis(ArrayList<Propriedade> imoveis) {
        this.imoveis = imoveis;
    }
}
