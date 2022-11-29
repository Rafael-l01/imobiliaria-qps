package model.agenda;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public abstract class InterfaceAgenda {
    private ArrayList<LocalDateTime> visitas;

    public InterfaceAgenda() {
        this.visitas = new ArrayList<LocalDateTime>();
    }

    public ArrayList<LocalDateTime> getVisitas() {
        return visitas;
    }

    public void setVisitas(ArrayList<LocalDateTime> visitas) {
        this.visitas = visitas;
    }

    public abstract void marcarVisita(LocalDateTime dataHorarioInicio);

    public abstract void desmarcarVisita(LocalDateTime dataHorarioInicio);
}
