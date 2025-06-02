public class Consulta implements Agendavel {
    private String data;
    private int hora;
    private String tipo;
    public Medica medica;
    public Paciente paciente;
    private Prontuario prontuario;

    public Consulta(String data, int hora, String tipo, Medica medica, Paciente paciente) {
        this.data = data;
        this.hora = hora;
        this.tipo = tipo;
        this.medica = medica;
        this.paciente = paciente;
    }

    public void agendar() throws AgendaNaoDisponivelException {
        AgendaDisponibilidade agenda = medica.getAgenda(data);
        if (agenda == null) {
            throw new AgendaNaoDisponivelException("Data não disponível");
        }
        agenda.ocuparHorario(hora);
        paciente.adicionarConsulta(this);
    }

    public void encerrarConsulta(String detalhes, String sintomas, String examesSolicitados, String medicamentos) {
        this.prontuario = new Prontuario(detalhes, sintomas, examesSolicitados, medicamentos);
    }

    public String getData() {
        return data;
    }

    public int getHora() {
        return hora;
    }

    public Medica getMedica() {
        return medica;
    }
}