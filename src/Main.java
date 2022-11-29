import tests.Teste;
import tests.TesteGerenciaSessao;
import tests.TesteProcessoPropriedade;
import tests.TesteRealizarPropostaCompra;

public class Main {
    public static void main(String[] args) {

        TesteGerenciaSessao testeGerenciaSessao = new TesteGerenciaSessao();
        TesteRealizarPropostaCompra testePropostaCompra = new TesteRealizarPropostaCompra();
        TesteProcessoPropriedade testeProcessoPropriedade = new TesteProcessoPropriedade();

//        testeGerenciaSessao.run();
//        testePropostaCompra.run();
        testeProcessoPropriedade.run();

    }
}