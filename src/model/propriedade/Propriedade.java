package model.propriedade;

import model.agenda.Agenda;

public class Propriedade extends InterfacePropriedade {
    public Propriedade(int id, Endereco endereco, double area, double valorCondominio, double valorImovel, int quartos, int banheiros, int vagasGaragem, String descricao, Agenda agenda) {
        super(id, endereco, area, valorCondominio, valorImovel, quartos, banheiros, vagasGaragem, descricao, agenda);
    }
}
