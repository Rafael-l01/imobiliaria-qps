import tests.*;

public class Main {
    public static void main(String[] args) {

        TesteGerenciaSessao testeGerenciaSessao = new TesteGerenciaSessao();
        TesteRealizarPropostaCompra testePropostaCompra = new TesteRealizarPropostaCompra();
        TesteProcessoPropriedade testeProcessoPropriedade = new TesteProcessoPropriedade();
        TesteProcessoAgenda testeProcessoAgenda = new TesteProcessoAgenda();

        testeGerenciaSessao.run();
        testePropostaCompra.run();
        testeProcessoPropriedade.run();
        testeProcessoAgenda.run();
    }
}