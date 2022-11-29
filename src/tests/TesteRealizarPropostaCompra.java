package tests;

import java.util.ArrayList;
import java.util.Date;
import model.propostaCompra.PropostaCompra;
import processos.GerenciaSessao;
import processos.RealizarPropostaCompra;

public class TesteRealizarPropostaCompra extends Teste {

  private ArrayList<PropostaCompra> propostas;

  private RealizarPropostaCompra realizarPropostaCompra;


  public void testeProporCompra(){
    System.out.println("Teste Propor Compra 1");
    realizarPropostaCompra.proporCompra(1, 1, 10000, propostas);
    System.out.println("Propostas de Compra: " + this.propostas);

    System.out.println("\nTeste Propor Compra 2");
    realizarPropostaCompra.proporCompra(2, 2, 60000, propostas);
    System.out.println("Propostas de Compra: " + this.propostas);

  }

  @Override
  public void setUp() {
    realizarPropostaCompra = new RealizarPropostaCompra();
    this.propostas = new ArrayList<>();
  }

  @Override
  public void run() {
    System.out.println("TESTE PROPOR COMPRAR \n");
    this.testeProporCompra();
  }


}
