package services;

import model.propriedade.Endereco;
import model.propriedade.Propriedade;
import model.usuario.Administrador;

import java.util.ArrayList;
import java.util.Iterator;

public class GerenciaPropriedade extends ProcessoPropriedade {

    public ArrayList<Propriedade> cadastrarImovel(Endereco endereco, double area, double valorCondominio, double valorImovel, int quartos, int banheiros, int vagasGaragem, String descricao, ArrayList<Propriedade> propriedades) {
        Propriedade propriedade = new Propriedade(endereco, area, valorCondominio, valorImovel, quartos, banheiros, vagasGaragem, descricao);
        propriedades.add(propriedade);

        return propriedades;
    }

    public ArrayList<Propriedade> excluirImovel(Propriedade propriedade, ArrayList<Propriedade> propriedades) {
        propriedades.remove(propriedade);

        return propriedades;
    }

    public ArrayList<Propriedade> alterarImovel(Propriedade imovelModificado, ArrayList<Propriedade> propriedades) {
        Iterator<Propriedade> iterator = propriedades.iterator();
        while(iterator.hasNext()){
            Propriedade propriedade = iterator.next();
            if(propriedade.getId() == imovelModificado.getId()) {
                propriedades.remove(propriedade);
                propriedades.add(imovelModificado);
                break;
            }
        }

        return propriedades;
    }

    public ArrayList<Propriedade> aprovarCadastroImovel(Administrador administrador, Propriedade propriedade, boolean aprovado, String justificativa, ArrayList<Propriedade> propriedades) {
        if(aprovado == true){
            propriedades.add(propriedade);
        }
        else {
            System.out.println("Administrador " + administrador.getNome() + " rejeitou o cadastro do imovel com a seguinte justificativa: " + justificativa);
        }

        return propriedades;
    }
}
