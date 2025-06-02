import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            // Criar médica
            Medica medica = new Medica("Dra. Ana", "12345678900", "ana@clinica.com", "11999999999", "CRM1234", Arrays.asList("Cardiologia"));

            // Criar paciente
            Paciente paciente = new Paciente("João Silva", "98765432100", "joao@email.com", "11988888888", "1990-01-01", Sexo.MASCULINO, TipoSanguineo.O_POSITIVO);

            // Criar técnico
            Tecnico tecnico = new Tecnico("Carlos Técnico", "11122233344", "carlos@clinica.com", "11977777777");

            // Disponibilizar agenda para uma data
            String dataConsulta = "2025-05-23";
            medica.abrirAgenda(dataConsulta);

            // Fazer agendamento de consulta
            Consulta consulta = new Consulta(dataConsulta, 10, "Rotina", medica, paciente);
            consulta.agendar();

            // Encerrar consulta
            consulta.encerrarConsulta("Consulta realizada com sucesso", "Dor de cabeça", "Exame de sangue", "Paracetamol");

            // Marcar exame
            Exame exame = new Exame("Raio-X", "2025-05-24", 11, tecnico);
            exame.agendar();
            exame.encerrarExame("Laudo normal");

            // Adicionar exame ao histórico
            paciente.adicionarExame(exame);

            // Visualizar histórico
            System.out.println("Histórico de consultas do paciente:");
            for (Consulta c : paciente.getHistoricoConsultas()) {
                System.out.println("Consulta com " + c.medica.nome + " em " + c.data + " às " + c.hora + "h");
            }

            System.out.println("Histórico de exames do paciente:");
            for (Exame e : paciente.getHistoricoExames()) {
                System.out.println("Exame " + e.nome + " em " + e.data + " às " + e.hora + "h, Laudo: " + e.laudo);
            }

        } catch (AgendaNaoDisponivelException e) {
            System.out.println("Erro ao agendar: " + e.getMessage());
        }
    }
}