package services;

import model.propriedade.Propriedade;
import model.usuario.Corretor;

import java.time.LocalDateTime;
import java.util.Iterator;

public class AgendamentoVisitas extends ProcessoAgenda {
    public boolean consultarAgendaPropriedade(Propriedade propriedade, LocalDateTime dataHorarioInicio) {
        Iterator<LocalDateTime> iteratorPropriedade = propriedade.getAgenda().getVisitas().iterator();
        while(iteratorPropriedade.hasNext()){
            LocalDateTime dataHorario = iteratorPropriedade.next();
            if(dataHorario.equals(dataHorarioInicio)){
                return false;
            }
        }

        return true;
    }

    public boolean consultarAgendaCorretor(Corretor corretor, LocalDateTime dataHorarioInicio) {
        Iterator<LocalDateTime> iteratorCorretor = corretor.getAgenda().getVisitas().iterator();
        while(iteratorCorretor.hasNext()){
            LocalDateTime dataHorario = iteratorCorretor.next();
            if(dataHorario.equals(dataHorarioInicio)){
                return false;
            }
        }

        return true;
    }
}
