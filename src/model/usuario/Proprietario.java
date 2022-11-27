package model.usuario;

import model.propriedade.Propriedade;

import java.util.ArrayList;

public class Proprietario extends Usuario {
    private ArrayList<Propriedade> imoveis;

    public Proprietario(ArrayList<Propriedade> imoveis) {
        this.imoveis = imoveis;
    }

    public ArrayList<Propriedade> getImoveis() {
        return imoveis;
    }

    public void setImoveis(ArrayList<Propriedade> imoveis) {
        this.imoveis = imoveis;
    }
}
