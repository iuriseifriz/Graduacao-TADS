public class Tecnico extends Pessoa {
    private String especialidade;

    public Tecnico(String nome, String cpf, String email, String telefone, String especialidade) {
        super(nome, cpf, email, telefone);
        this.especialidade = especialidade;

        System.out.println("\nNome do tecnico: " + nome + ", Especialidade: " + especialidade + "\n");
    }
}