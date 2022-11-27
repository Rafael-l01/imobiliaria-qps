package model.usuario;

import model.agenda.Agenda;

public class Corretor extends Usuario {
    private String creci;
    private Agenda agenda;

    public Corretor(String creci, Agenda agenda) {
        this.creci = creci;
        this.agenda = agenda;
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
