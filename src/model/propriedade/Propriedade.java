package model.propriedade;

import model.agenda.Agenda;

public class Propriedade extends InterfacePropriedade {
    public Propriedade(Endereco endereco, double area, double valorCondominio, double valorImovel, int quartos, int banheiros, int vagasGaragem, String descricao) {
        super(endereco, area, valorCondominio, valorImovel, quartos, banheiros, vagasGaragem, descricao);
    }
}
