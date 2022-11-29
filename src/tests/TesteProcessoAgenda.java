package tests;

import model.propriedade.Endereco;
import model.propriedade.Propriedade;
import model.usuario.Corretor;
import services.agenda.GerenciaAgenda;

import java.time.LocalDateTime;
import java.util.Date;

public class TesteProcessoAgenda extends Teste {
    private Propriedade propriedade1;
    private Propriedade propriedade2;
    private LocalDateTime dataHorarioInicio;
    private Date dataNascimento;
    private Corretor corretor;
    private Corretor outroCorretor;
    private GerenciaAgenda gerenciaAgenda;

    @Override
    public void setUp() {
        this.propriedade1 = new Propriedade(new Endereco("Rua Trento",
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
                "Muito grande e legal"
        );
        this.propriedade2 = new Propriedade(new Endereco("Rua Joao",
                200,
                "Santa Tereza",
                "Belo Horizonte",
                "MG",
                "Brasil",
                "",
                "311502321",
                "Rua perto da padaria"
        ),
                1000,
                10000,
                500,
                4,
                3,
                0,
                "Muito grande"
        );
        this.dataNascimento = new Date(2000, 10, 10);
        this.dataHorarioInicio =  LocalDateTime.of(2022, 11, 29, 14, 0);
        this.corretor = new Corretor(
                "Davi Emediato (Administrador)",
                "davizinho.123@email.com",
                "31999999999",
                "12345678913",
                this.dataNascimento,
                "senhaAdministrador",
                "123456789"
        );
        this.outroCorretor = new Corretor(
                "Lucca (Administrador)",
                "lucca.123@email.com",
                "31999999999",
                "12345678913",
                this.dataNascimento,
                "senhaAdministrador",
                "123456789"
        );
        this.gerenciaAgenda = new GerenciaAgenda();
    }

    public void testeMarcarVisita() {
        System.out.println("Teste Marcar Visita");

        System.out.println("Marcar visita com sucesso: ");
        this.gerenciaAgenda.marcarVisita(this.propriedade1, this.corretor, this.dataHorarioInicio);

        System.out.println("Marcar segunda visita com sucesso: ");
        this.gerenciaAgenda.marcarVisita(this.propriedade1, this.corretor, LocalDateTime.of(2022, 11, 29, 15, 0));

        System.out.println("Marcar visita no mesmo horário da primeira (deve ser mal sucedida): ");
        this.gerenciaAgenda.marcarVisita(this.propriedade1, this.corretor, this.dataHorarioInicio);

        System.out.println("Marcar visita em outro imovel, no mesmo horário da primeira com outro corretor (deve ser bem sucedida): ");
        this.gerenciaAgenda.marcarVisita(this.propriedade2, this.outroCorretor, this.dataHorarioInicio);

        System.out.println("Marcar visita em outro imovel, no mesmo horário da primeira com o mesmo corretor (deve ser mal sucedida): ");
        this.gerenciaAgenda.marcarVisita(this.propriedade2, this.corretor, this.dataHorarioInicio);

        System.out.println("Agenda das visitas na propriedade 1 após as marcações: " + this.propriedade1.getAgenda().getVisitas());
        System.out.println("Agenda das visitas na propriedade 2 após as marcações: " + this.propriedade2.getAgenda().getVisitas());
    }

    public void testeDesmarcarVisita() {
        System.out.println("\nTeste Desmarcar Visita");
        this.gerenciaAgenda.desmarcarVisita(this.propriedade1, this.corretor, this.dataHorarioInicio);

        System.out.println("Agenda das visitas na propriedade 1 após desmarcar visita das 14h: " + this.propriedade1.getAgenda().getVisitas());
    }

    @Override
    public void run() {
        System.out.println("\nTESTE PROCESSO AGENDA \n");
        this.testeMarcarVisita();
        this.testeDesmarcarVisita();
    }
}
