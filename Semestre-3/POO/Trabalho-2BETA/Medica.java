import java.util.*;

public class Medica extends Pessoa {
    private String crm;
    private List<String> especialidades;
    private Map<String, AgendaDisponibilidade> agenda;

    public Medica(String nome, String cpf, String email, String telefone, String crm, List<String> especialidades) {
        super(nome, cpf, email, telefone);
        this.crm = crm;
        this.especialidades = especialidades;
        this.agenda = new HashMap<>();
    }

    public void abrirAgenda(String data) {
        agenda.put(data, new AgendaDisponibilidade(data));
    }

    public AgendaDisponibilidade getAgenda(String data) {
        return agenda.get(data);
    }
}