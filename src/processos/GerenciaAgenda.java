package processos;

import model.propriedade.Propriedade;
import model.usuario.Corretor;

import java.util.Date;

public class GerenciaAgenda extends ProcessoAgenda{
    public boolean marcarVisita(Propriedade propriedade, Corretor corretor, Date dataHorarioInicio) {
        AgendamentoVisitas agendamentoVisitas = new AgendamentoVisitas();

        if(agendamentoVisitas.consultarAgendaCorretor(corretor, dataHorarioInicio) == true && agendamentoVisitas.consultarAgendaPropriedade(propriedade, dataHorarioInicio) == true){
            propriedade.getAgenda().marcarVisita(dataHorarioInicio);
            corretor.getAgenda().marcarVisita(dataHorarioInicio);
            return true;
        }

        return false;
    }

    public void desmarcarVisita(Propriedade propriedade, Corretor corretor, Date dataHorarioInicio) {
        AgendamentoVisitas agendamentoVisitas = new AgendamentoVisitas();
        propriedade.getAgenda().desmarcarVisita(dataHorarioInicio);
        corretor.getAgenda().desmarcarVisita(dataHorarioInicio);
        return;
    }
}
