package model.agenda;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Agenda extends InterfaceAgenda {
    public Agenda() {
        super();
    }

    public void marcarVisita(LocalDateTime dataHorarioInicio) {
        ArrayList<LocalDateTime> visitas = this.getVisitas();
        visitas.add(dataHorarioInicio);
        this.setVisitas(visitas);
    }

    public void desmarcarVisita(LocalDateTime dataHorarioInicio) {
        ArrayList<LocalDateTime> visitas = this.getVisitas();
        visitas.remove(dataHorarioInicio);
        this.setVisitas(visitas);
    }
}
