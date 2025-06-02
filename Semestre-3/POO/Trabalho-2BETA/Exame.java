public class Exame implements Agendavel {
    private String nome;
    private String data;
    private int hora;
    private Pessoa responsavel;
    private String laudo;

    public Exame(String nome, String data, int hora, Pessoa responsavel) {
        this.nome = nome;
        this.data = data;
        this.hora = hora;
        this.responsavel = responsavel;
    }

    public void agendar() {
        // Exames não precisam de agenda médica
    }

    public void encerrarExame(String laudo) {
        this.laudo = laudo;
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public int getHora() {
        return hora;
    }

    public String getLaudo() {
        return laudo;
    }
}