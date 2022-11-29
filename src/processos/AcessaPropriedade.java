package processos;

import model.propriedade.Propriedade;

import java.util.ArrayList;
import java.util.Iterator;

public class AcessaPropriedade extends ProcessoPropriedade {
    public ArrayList<Propriedade> buscarImoveis(String rua, String bairro, double area, double valorCondominio, double valorImovel, int quartos, int banheiros, int vagasGaragem, ArrayList<Propriedade> propriedades) {
        ArrayList<Propriedade> propriedadesFiltradas = new ArrayList<Propriedade>();

        Iterator<Propriedade> iterator = propriedades.iterator();
        while(iterator.hasNext()){
            Propriedade propriedade = iterator.next();
            if(propriedade.getEndereco().getRua().equals(rua) && propriedade.getEndereco().getBairro().equals(bairro) && propriedade.getArea() == area && propriedade.getValorCondominio() == valorCondominio && propriedade.getValorImovel() == valorImovel && propriedade.getQuartos() == quartos && propriedade.getBanheiros() == banheiros && propriedade.getVagasGaragem() == vagasGaragem) {
                propriedadesFiltradas.add(propriedade);
            }
        }

        return propriedadesFiltradas;
    }
}
