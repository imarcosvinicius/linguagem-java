package space.mavitech.linguagemjava.dio.collections.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<String, Integer>();
    }

    public void addContato(String nome, Integer numero) {
        agendaContatoMap.put(nome, numero);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        } else {
            System.out.println("Lista de contatos vazia.");
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer exibirContatosPorNome(String nome) {
        Integer contato = null;
        if (!agendaContatoMap.isEmpty()) {
            contato = agendaContatoMap.get(nome);
        }

        return contato;
    }

    public static void main(String[] args) {
        AgendaContatos meusContatos = new AgendaContatos();
        meusContatos.addContato("Jim", 99999999);
        meusContatos.addContato("Jim Carrey", 22222222);
        meusContatos.addContato("Jim C.", 33333333);
        meusContatos.addContato("Jim Carrey Friend", 11111111);
        meusContatos.addContato("Jim Carrey Best", 33333333);
        meusContatos.addContato("Jim", 44444444);

        meusContatos.exibirContatos();

        meusContatos.removerContato("Jim Carrey Best");

        meusContatos.exibirContatos();

        System.out.println("O múmero é: " + meusContatos.exibirContatosPorNome("Jim Carrey"));

    }

}
