import java.util.*;

public class Paciente extends Pessoa {
    private String dtNascimento;
    private Sexo sexo;
    private TipoSanguineo tipoSanguineo;
    private List<Consulta> historicoConsultas = new ArrayList<>();
    private List<Exame> historicoExames = new ArrayList<>();

    public Paciente(String nome, String cpf, String email, String telefone, String dtNascimento, Sexo sexo, TipoSanguineo tipoSanguineo) {
        super(nome, cpf, email, telefone);
        this.dtNascimento = dtNascimento;
        this.sexo = sexo;
        this.tipoSanguineo = tipoSanguineo;
    }

    public void adicionarConsulta(Consulta consulta) {
        historicoConsultas.add(consulta);
    }

    public void adicionarExame(Exame exame) {
        historicoExames.add(exame);
    }

    public List<Consulta> getHistoricoConsultas() {
        return historicoConsultas;
    }

    public List<Exame> getHistoricoExames() {
        return historicoExames;
    }
}