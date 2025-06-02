public class Main {
    public static void main(String[] args) throws AgendaNaoDisponivelException {
      
        //cria objeto paciente
        Paciente paciente = new Paciente(
            "João Silva", 
            "123.123.123-12", 
            "joao@gmail.com", 
            "12 3456-8900",
            "01, 01, 1990",
            "sla",
            "M",
            TipoSanguineo.A_POS
        );
        //cria objeto medica
        Medica medica = new Medica(
            "joana darc", 
            "123.456.789-00", 
            "joana@gmail.com", 
            "53 9999-9999",
            "CRM1234",
            "Oncologia"
            );
        //cria o objeto tecnico, que nao faz nada
        Tecnico tecnico = new Tecnico(
            "astolfo machado",
            "123.456.789-00",
            "XXXXXXXXXXXXXX",
            "53 9999-9999",
            "Radiologia"
        );

        //puxa aquela parafernalha lá da class medico pra pegar os horarios do dia
        medica.abrirAgenda("2025-05-31");

        //cria objeto consulta e insere os valores nele
        Consulta consulta = new Consulta(null, medica, paciente);
        consulta.agendar("2025-05-31", "15:00");

        consulta.encerrar();

        //cria objeto exame e mete os dados nele, executando o metodo de agendamento
        Exame exame = new Exame("Raio-X de torax", paciente, tecnico.getNome());
        exame.agendar("2025-06-01", "10:00");

        //metodo do exame que encerra o exame e emostra laudo
        exame.encerrar();

        //mostra historico do paciente
        System.out.println("\nHistórico de Consultas:");
        for (Consulta c : paciente.getHistoricoConsultas()) {
            System.out.println(c);
        }

        System.out.println("\nHistórico de Exames:");
        for (Exame e : paciente.getHistoricoExames()) {
            System.out.println(e);
        }
    
    }
}