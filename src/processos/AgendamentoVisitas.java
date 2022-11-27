package processos;

import model.agenda.Agenda;
import model.propriedade.Propriedade;
import model.usuario.Corretor;
import model.usuario.Usuario;

import java.util.Date;
import java.util.Iterator;

public class AgendamentoVisitas extends ProcessoAgenda {
    public boolean consultarAgendaPropriedade(Propriedade propriedade, Date dataHorarioInicio) {
        Iterator<Date> iteratorPropriedade = propriedade.getAgenda().getVisitas().iterator();
        while(iteratorPropriedade.hasNext()){
            Date dataHorario = iteratorPropriedade.next();
            if(dataHorario.equals(dataHorarioInicio)){
                return false;
            }
        }

        return true;
    }

    public boolean consultarAgendaCorretor(Corretor corretor, Date dataHorarioInicio) {
        Iterator<Date> iteratorCorretor = corretor.getAgenda().getVisitas().iterator();
        while(iteratorCorretor.hasNext()){
            Date dataHorario = iteratorCorretor.next();
            if(dataHorario.equals(dataHorarioInicio)){
                return false;
            }
        }

        return true;
    }
}
