import java.time.LocalDateTime;
//cria a classe exame com os seus atributos e com as regras do agendavel
public class Exame implements Agendavel {
    private String nomeExame;
    private LocalDateTime dataHora;
    private String responsavel;
    private Paciente paciente;
    private String laudo;

    //construtor do exame
    public Exame(String nomeExame, Paciente paciente, String responsavel) {
        this.nomeExame = nomeExame;
        this.paciente = paciente;
        this.responsavel = responsavel;
    }

    //override pra checar os bgl
    @Override
    //metodo pra agendar exame
    public void agendar(String data, String hora) {
        this.dataHora = LocalDateTime.parse(data + "T" + hora);//seta a data e hora do eame já formtado
        //printa informacoes do exame
        System.out.println("Exame " + nomeExame + " agendado para " + paciente.getNome() +
        " com responsável " + responsavel + " no dia " + data + " às " + hora + ".\n");
        //adiciona o conteudo do laudo
        this.laudo = "Laudo do exame " + nomeExame + ".";
    }
    
    @Override
    //metodo pra encerrar o exame. ele printa que foi encerrado e o laudo, depois adiciona o exame dentro do objeto paciente
    public void encerrar() {
        System.out.println("Exame encerrado. Laudo: " + laudo);
        paciente.adicionarExame(this);
    }

    //usa o toString para printar um objeto de forma legível
    @Override
    public String toString() {
        return nomeExame + " em " + dataHora + " - Responsável: " + responsavel;
    }
}