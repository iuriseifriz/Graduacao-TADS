import java.util.*;

public class AgendaDisponibilidade {
    private String data;
    private Map<Integer, Boolean> horarios;

    public AgendaDisponibilidade(String data) {
        this.data = data;
        this.horarios = new HashMap<>();
        for (int i = 9; i <= 17; i++) {
            horarios.put(i, true);
        }
    }

    public boolean isDisponivel(int hora) {
        return horarios.getOrDefault(hora, false);
    }

    public void ocuparHorario(int hora) throws AgendaNaoDisponivelException {
        if (!isDisponivel(hora)) {
            throw new AgendaNaoDisponivelException("Horário não disponível");
        }
        horarios.put(hora, false);
    }
}