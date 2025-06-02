import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Medica extends Pessoa {
    private String crm;
    private String especialidade;
    //aqui é criado uma matriz que tem varios dias e cada dia tem vários horários. Só que é uma chave-valor (dia=chave/horario=valor). 
    //ou seja, um simples tensor 2D mas do jeito asqueroso do java de fazer
    // cria um Map<chave, valor>, no caso Map<dia, horario>
    //agendaDisponibilidade é o nome desse map, nome da variavel
    private Map<String, List<String>> agendaDisponibilidade = new HashMap<>();

    //constroi a medica
    public Medica(String nome, String cpf, String email, String telefone, String crm, String especialidade) {
        super(nome, cpf, email, telefone);
        this.crm = crm;
        this.especialidade = especialidade;

        System.out.println("\nNome da medica: " + nome + ", Especialidade: " + especialidade);

    }

    //metodo que preenche a agenda
    public void abrirAgenda(String data) {
        List<String> horarios = new ArrayList<>();
        for (int hora = 9; hora <= 17; hora++) { //vai passando pela list de horarios
            
            horarios.add(String.format("%02d:00", hora)); //adiciona o horario na lista
        }
        agendaDisponibilidade.put(data, horarios);//associa aqueles horarios todos com a data. a data é metida lá no main
    }

    //metodo get. o main aciona esse metodo, enfiando a data nele, ai ele aciona o metodo acima pra preencher os horarios pra essa data e envia de volta pro main
    public List<String> getAgendaDisponibilidade(String data) {
        return agendaDisponibilidade.get(data);
    }
}