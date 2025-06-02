import java.util.ArrayList;
import java.util.List;
    // cria a classe e chupa atribusto de pessoa
public class Paciente extends Pessoa {
    //adiciona outros atributos que n tem em pessoa
    private String prontuario;
    private String dtNascimento;
    private String sexo;
    private TipoSanguineo tipoSanguineo;
    //importante: o historico de consulta é uma lista com objetos prontuario
    private List<Consulta> historicoConsultas = new ArrayList<>();
    //e o mesmo vale pro exame. foi asism que consegui resolver o problema da persistencia.
    private List<Exame> historicoExames = new ArrayList<>();

    //funcao que constroi o objeto e printa
    public Paciente(String nome, String cpf, String email, String telefone, String dtNascimento, String prontuario, String sexo, TipoSanguineo tipoSanguineo) 
    {
        // chupa os atributos chupados e outros
        super(nome, cpf, email, telefone);
        this.dtNascimento = dtNascimento;
        this.prontuario = prontuario;
        this.tipoSanguineo = tipoSanguineo;

        System.out.println("\nNome do paciente: " + nome + ", CPF: " + cpf + ", data de nascimento: " + dtNascimento + ", Tipo Sanguíneo: " + tipoSanguineo);

    }

    //voide que adiciona o prontuari na list histconsulta
    public void adicionarConsulta(Consulta consulta) {
        historicoConsultas.add(consulta);
    }

    //mesma coisa mas com lista histexames
    public void adicionarExame(Exame exame) {
        historicoExames.add(exame);
    }

    //getters pra pegar essas listas aer
    
    public List<Consulta> getHistoricoConsultas() {
        return historicoConsultas;
    }

    public List<Exame> getHistoricoExames() {
        return historicoExames;
    }
}