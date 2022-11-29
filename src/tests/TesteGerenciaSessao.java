package tests;

import java.util.ArrayList;
import java.util.Date;

import model.usuario.Usuario;
import services.sessaoUsuario.GerenciaSessao;

public class TesteGerenciaSessao extends Teste {

  private Date dataNascimento;

  private ArrayList<Usuario> usuarios;

  private GerenciaSessao gerenciaSessao;

  public void testeCadastrarProprietario(){
    System.out.println("\nTeste Cadastrar Proprietario");
    this.usuarios = gerenciaSessao.cadastrarProprietario(
        "Rafael Silverio (Proprietario)",
        "rafael.silverio@email.com",
        "31999999999",
        "12345678913",
        this.dataNascimento,
        "senha",
        this.usuarios);
    System.out.println("Usuarios apos cadastrar proprietario" + this.usuarios);
  }

  public void testeCadastrarComprador(){
    System.out.println("Teste Cadastrar Comprador");
    this.usuarios = gerenciaSessao.cadastrarComprador(
        "Lucca Miranda (Comprador)",
        "lucca.miranda@email.com",
        "31999999999",
        "12345678912",
        this.dataNascimento,
        "senha",
        this.usuarios);
    System.out.println("Usuarios apos cadastrar comprador" + this.usuarios.toString());
  }

  public void testeLoginUsuario(){
    System.out.println("\nTeste Login Usuario");
    boolean loginCompradorErrado = gerenciaSessao.loginUsuario("rafael.silverio@email.com", "notsenha", this.usuarios);
    boolean loginCompradorCerto = gerenciaSessao.loginUsuario("rafael.silverio@email.com", "senha", this.usuarios);
    boolean loginProprietarioErrado = gerenciaSessao.loginUsuario("lucca.miranda@email.com", "notsenha", this.usuarios);
    boolean loginProprietarioCerto = gerenciaSessao.loginUsuario("lucca.miranda@email.com", "senha", this.usuarios);

    System.out.println("Login Comprador Errado: (rafael.silverio@email.com - notsenha) -> " + loginCompradorErrado);
    System.out.println("Login Comprador Certo: (rafael.silverio@email.com - senha) -> " + loginCompradorCerto);
    System.out.println("Login Proprietario Errado: (lucca.miranda@email.com - notsenha) -> " + loginProprietarioErrado);
    System.out.println("Login Proprietario Certo: (lucca.miranda@email.com - senha) -> " + loginProprietarioCerto);
  }

  @Override
  public void setUp() {
    gerenciaSessao = new GerenciaSessao();
    this.dataNascimento = new Date(2000, 10, 10);
    this.usuarios = new ArrayList<>();
  }

  @Override
  public void run() {
    System.out.println("\nTESTE GERENCIA SESSAO \n");
    this.testeCadastrarComprador();
    this.testeCadastrarProprietario();
    this.testeLoginUsuario();
  }

}
