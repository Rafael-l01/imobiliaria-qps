package model.usuario;

import model.agenda.Agenda;

import java.util.ArrayList;
import java.util.Date;

public class Corretor extends Usuario {
    private String creci;
    private Agenda agenda;

    public Corretor(String nome, String email, String numeroTelefone, String cpf, Date dataNascimento, String senha, String creci) {
        super(nome, email, numeroTelefone, cpf, dataNascimento, senha);
        this.creci = creci;
        this.agenda = new Agenda();
    }

    public String getCreci() {
        return creci;
    }

    public void setCreci(String creci) {
        this.creci = creci;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }
}
