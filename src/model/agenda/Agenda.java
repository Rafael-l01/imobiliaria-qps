package model.agenda;

import java.util.ArrayList;
import java.util.Date;

public class Agenda extends InterfaceAgenda {
    public Agenda() {
        super();
    }

    public void marcarVisita(Date dataHorarioInicio) {
        ArrayList<Date> visitas = this.getVisitas();
        visitas.add(dataHorarioInicio);
        this.setVisitas(visitas);
    }

    public void desmarcarVisita(Date dataHorarioInicio) {
        ArrayList<Date> visitas = this.getVisitas();
        visitas.remove(dataHorarioInicio);
        this.setVisitas(visitas);
    }
}
