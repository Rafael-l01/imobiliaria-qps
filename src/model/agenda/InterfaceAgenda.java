package model.agenda;

import java.util.ArrayList;
import java.util.Date;

public abstract class InterfaceAgenda {
    private ArrayList<Date> visitas;

    public InterfaceAgenda(ArrayList<Date> visitas) {
        this.visitas = visitas;
    }

    public ArrayList<Date> getVisitas() {
        return visitas;
    }

    public void setVisitas(ArrayList<Date> visitas) {
        this.visitas = visitas;
    }
}
