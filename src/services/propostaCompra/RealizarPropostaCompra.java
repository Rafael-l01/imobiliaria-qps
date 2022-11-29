package services.propostaCompra;

import model.propostaCompra.PropostaCompra;
import services.propostaCompra.ProcessoPropostaCompra;

import java.util.ArrayList;

public class RealizarPropostaCompra extends ProcessoPropostaCompra {
    public void proporCompra(int idComprador, int idImovel, double valor, ArrayList<PropostaCompra> propostas){
        PropostaCompra proposta = new PropostaCompra(idComprador, idImovel, valor);
        propostas.add(proposta);
        System.out.println("Email de proposta de compra enviado para proprietário");
    }
}
