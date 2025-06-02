//INTERFACEEEEEEEEEEEEEEEE negocio do java pra definir regras
public interface Agendavel {
    void agendar(String data, String hora) throws AgendaNaoDisponivelException;
    void encerrar();
}