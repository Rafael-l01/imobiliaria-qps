package services.agenda;

import model.propriedade.Propriedade;
import model.usuario.Corretor;

import java.time.LocalDateTime;

public class GerenciaAgenda extends ProcessoAgenda {
    public boolean marcarVisita(Propriedade propriedade, Corretor corretor, LocalDateTime dataHorarioInicio) {
        AgendamentoVisitas agendamentoVisitas = new AgendamentoVisitas();

        if(agendamentoVisitas.consultarAgendaCorretor(corretor, dataHorarioInicio) == true && agendamentoVisitas.consultarAgendaPropriedade(propriedade, dataHorarioInicio) == true){
            propriedade.getAgenda().marcarVisita(dataHorarioInicio);
            corretor.getAgenda().marcarVisita(dataHorarioInicio);
            System.out.println("Visita cadastrada com sucesso");
            return true;
        }

        System.out.println("Não foi possível cadastrar essa visita");
        return false;
    }

    public void desmarcarVisita(Propriedade propriedade, Corretor corretor, LocalDateTime dataHorarioInicio) {
        AgendamentoVisitas agendamentoVisitas = new AgendamentoVisitas();
        propriedade.getAgenda().desmarcarVisita(dataHorarioInicio);
        corretor.getAgenda().desmarcarVisita(dataHorarioInicio);
        System.out.println("Visita desmarcada");
        return;
    }
}
