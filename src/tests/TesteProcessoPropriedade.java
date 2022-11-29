package tests;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import model.propostaCompra.PropostaCompra;
import model.propriedade.Endereco;
import model.propriedade.Propriedade;
import model.usuario.Administrador;
import processos.AcessaPropriedade;
import processos.GerenciaPropriedade;
import processos.RealizarPropostaCompra;

public class TesteProcessoPropriedade extends Teste{

  private ArrayList<Propriedade> propriedades;
  private Date dataNascimento;

  private ArrayList<Propriedade> propriedadesAprovadas;
  private Administrador administrador;
  private GerenciaPropriedade gerenciaPropriedade;
  private AcessaPropriedade acessaPropriedade;
  public void testeCadastrarImovel() {
    System.out.println("Teste Cadastrar Imovel");
    gerenciaPropriedade.cadastrarImovel(
        new Endereco("Rua Deputado Bernardino",
            100,
            "Cidade Nova",
            "Belo Horizonte",
            "MG",
            "Brasil",
            "Apart 10",
            "31170200",
            "Atras da Padaria"
            ),
        1000,
        10000,
        500,
        4,
        3,
        0,
        "Faz sol e chuva mas é muito agradavel no verão",
        this.propriedades
    );

    gerenciaPropriedade.cadastrarImovel(
        new Endereco("Avenida Cristiano Machado",
            301,
            "Cidade Nova",
            "Belo Horizonte",
            "MG",
            "Brasil",
            "Apart 100",
            "31170200",
            "Rua do Corre"
        ),
        1000,
        10000,
        500,
        4,
        3,
        0,
        "Não faz frio",
        this.propriedades
    );

    gerenciaPropriedade.cadastrarImovel(
        new Endereco("Rua Trento",
            100,
            "Bandeirantes",
            "Belo Horizonte",
            "MG",
            "Brasil",
            "",
            "31150100",
            "Rua perto da igreja"
        ),
        1000,
        10000,
        500,
        4,
        3,
        0,
        "Muito grande e legal",
        this.propriedades
    );

    System.out.println("Propriedades Cadastradas " + this.propriedades + "\n");
  }

  public void testeAprovarCadastroImovel(){
    System.out.println("Teste Cadastrar Imovel");
    boolean aprovacoes[] = {true,true, false};
    String justificativas[] = {"Tudo OK!", "OK", "CEP errado"};
    int index = 0;
    Iterator<Propriedade> iterator = propriedades.iterator();
    while(iterator.hasNext()){
      Propriedade propriedade = iterator.next();
      gerenciaPropriedade.aprovarCadastroImovel(administrador, propriedade, aprovacoes[index], justificativas[index], this.propriedadesAprovadas);
      index += 1;
    }

    System.out.println("\nPropriedades Aprovadas " + this.propriedadesAprovadas);
  }

  public void testeAlterarImovel(){
    System.out.println("\nTeste Alterar Imovel");

    Propriedade imovel = propriedadesAprovadas.get(0);
    System.out.println("Antes: " + imovel + "\n");

    Endereco enderecoModificado = imovel.getEndereco();
    enderecoModificado.setCep("3140010");
    imovel.setEndereco(enderecoModificado);
    propriedadesAprovadas = gerenciaPropriedade.alterarImovel(imovel, propriedadesAprovadas);
    System.out.println("Depois: " + imovel);
  }

  public void testeExcluirImovel(){
    System.out.println("\nTeste Excluir Imovel (Excluindo segundo imovel)");
    System.out.println("Antes: " + propriedadesAprovadas + "\n");

    Propriedade imovel = propriedadesAprovadas.get(1);
    propriedadesAprovadas = gerenciaPropriedade.excluirImovel(imovel, propriedadesAprovadas);
    System.out.println("Depois: " + propriedadesAprovadas + "\n");

  }

  public void testeBuscarImovel(){
    System.out.println("\nTeste Buscar Imovel (Buscando primeiro imovel)");
    ArrayList<Propriedade> propriedadesBuscadas = acessaPropriedade.buscarImoveis(
        "Avenida Cristiano Machado",
        "Cidade Nova",
        1000,
        10000,
        500,
        4,
        3,
        0,
        propriedadesAprovadas);
    System.out.println("Propriedades Buscadas: " + propriedadesBuscadas);
  }

  @Override
  public void setUp() {
    this.gerenciaPropriedade = new GerenciaPropriedade();
    this.acessaPropriedade = new AcessaPropriedade();
    this.dataNascimento = new Date(2000, 10, 10);
    administrador = new Administrador(
        "Davi Emediato (Administrador)",
        "davizinho.123@email.com",
        "31999999999",
        "12345678913",
        this.dataNascimento,
        "senhaAdministrador");
    this.propriedades = new ArrayList<>();
    this.propriedadesAprovadas = new ArrayList<>();
  }

  @Override
  public void run() {
    System.out.println("TESTE PROCESSO PROPRIEDADE \n");
    this.testeCadastrarImovel();
    this.testeAprovarCadastroImovel();
    this.testeAlterarImovel();
    this.testeExcluirImovel();
    this.testeBuscarImovel();
  }
}
