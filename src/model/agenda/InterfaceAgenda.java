package model.agenda;

import java.util.ArrayList;
import java.util.Date;

public abstract class InterfaceAgenda {
    private ArrayList<Date> visitas;

    public InterfaceAgenda() {
        this.visitas = new ArrayList<Date>();
    }

    public ArrayList<Date> getVisitas() {
        return visitas;
    }

    public void setVisitas(ArrayList<Date> visitas) {
        this.visitas = visitas;
    }

    public abstract void marcarVisita(Date dataHorarioInicio);

    public abstract void desmarcarVisita(Date dataHorarioInicio);
}
