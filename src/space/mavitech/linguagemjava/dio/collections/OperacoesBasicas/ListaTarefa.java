package space.mavitech.linguagemjava.dio.collections.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removeTarefa(String descricao) {

        List<Tarefa> tarefasRemove = new ArrayList<>();
        for (Tarefa tarefa : tarefaList) {
            if (tarefa.getDescricacao().equalsIgnoreCase(descricao)) {
                tarefasRemove.add(tarefa);
            }
        }
        tarefaList.removeAll(tarefasRemove);

    }

    public int totalTotalTarefas() {
        return tarefaList.size();
    }

    public void descricaoTarefas() {
        System.out.println("Tarefas: " + tarefaList);
    }


    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("Número total de tarefas: " + listaTarefa.totalTotalTarefas());
        listaTarefa.adicionarTarefa("Cortar o cabelo");
        listaTarefa.adicionarTarefa("Fazer a barba");
        listaTarefa.adicionarTarefa("Fazer a barba");
        listaTarefa.adicionarTarefa("Ir ao mercado");
        System.out.println("Número total de tarefas: " + listaTarefa.totalTotalTarefas());
        listaTarefa.removeTarefa("Fazer a barba");
        System.out.println("Número total de tarefas: " + listaTarefa.totalTotalTarefas());

        listaTarefa.descricaoTarefas();
    }
}