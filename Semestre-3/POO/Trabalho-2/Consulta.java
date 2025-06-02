import java.time.LocalDateTime;
import java.util.List;

//classe consulta implementa o conjunto de regras Agendavel. pq? pq o vini mandou usar interface.
public class Consulta implements Agendavel {
    //cria algumas variaveis que serao usadas na agenda
    private LocalDateTime dataHora;
    private Medica medico;
    private Paciente paciente;
    private Prontuario prontuario;

    //construtor da consulta. sim consulta é um objeto
    public Consulta(LocalDateTime dataHora, Medica medico, Paciente paciente) {
        this.dataHora = dataHora;
        this.medico = medico;
        this.paciente = paciente;
    }

    //metodo do agendavel, ele verifica os horarios da agenda
    @Override
    //cria o metodo agendar, recebe dentro dele os argumentos data e hora, e define que pode ocorrer uma excessao AgendaNao..
    public void agendar(String data, String hora) throws AgendaNaoDisponivelException {
        List<String> horariosDisponiveis = medico.getAgendaDisponibilidade(data); //pega da agenda os horarios disponiveis em determinada data
        if (horariosDisponiveis == null || !horariosDisponiveis.contains(hora)) {//verifica se o horario ta disponivel
            throw new AgendaNaoDisponivelException("Horário não disponível para agendamento.");//se nao estiver, manda excessao. essa linha insere a mensagem da excecao
        }


        horariosDisponiveis.remove(hora); //se estiver disponivel, arranca esse horario da agenda
        this.dataHora = LocalDateTime.parse(data + "T" + hora); //cria e formata o objeto data/hora

        //informa o usuario que o agendamento foi concluido
        System.out.println("Consulta agendada para " + paciente.getNome() + " com o médico " + medico.getNome() //
        + " no dia " + data + " às " + hora + ".\n");

        //mostra a agenda. lembrando: o horario usado foi arrancado
        System.out.println("Horarios disponiveis:\n");
        for (int i = 0; i < horariosDisponiveis.size(); i++) {
            System.out.print(horariosDisponiveis.get(i) + " | ");
        }
    }

    //outro metodo do agendavel
    @Override
    public void encerrar() {
        //cria o objeto prontuario
        this.prontuario = new Prontuario(
            "Consulta encerrada.",
            "Dor e Nausea.",
            "Raio x do torax.",
            "Dipirona e cytotec."
            );
            //printa o prontuario
            System.out.println("\n\nConsulta encerrada. Prontuário gerado para " + paciente.getNome() + "."
            + prontuario.getStatusConsulta() + prontuario.getSintomas()
            + prontuario.getExamesSolicitados() + prontuario.getMedicamentos() + "\n");
            //adiciona a o prontuario no historico do paciente
            paciente.adicionarConsulta(this);
        
    }

    //usa o toString para printar o objeto de forma legível
    @Override
    public String toString() {
        return "Consulta em " + dataHora + " com " + medico.getNome();
    }
}