package space.mavitech.linguagemjava.dio.collections.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void addEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosMapOrdenado = new TreeMap<>(eventosMap);
        System.out.println(eventosMapOrdenado);
    }

    public void obterProximoEvento() {
        Map<LocalDate, Evento> eventosMapOrdenado = new TreeMap<>(eventosMap);
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        for (Map.Entry<LocalDate, Evento> entry : eventosMapOrdenado.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.addEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração 1");
        agendaEventos.addEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atração 2");
        agendaEventos.addEvento(LocalDate.of(2000, Month.JANUARY, 12), "Evento 3", "Atração 3");
        agendaEventos.addEvento(LocalDate.of(2023, Month.DECEMBER, 14), "Evento 4", "Atração 4");
        agendaEventos.addEvento(LocalDate.of(2024, Month.SEPTEMBER, 20), "Evento 5", "Atração 5");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }


}