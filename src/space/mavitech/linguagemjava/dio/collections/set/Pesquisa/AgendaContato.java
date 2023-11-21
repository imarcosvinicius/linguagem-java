package space.mavitech.linguagemjava.dio.collections.set.Pesquisa;

import space.mavitech.linguagemjava.dio.collections.set.OperacoesBasicas.Contato;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {

    private Set<Contato> contatoSet;

    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }

    public void addContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisaPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContato agendaContatos = new AgendaContato();
        agendaContatos.addContato("Jim Carrey", 99999999);
        agendaContatos.addContato("Jim Carrey", 0);
        agendaContatos.addContato("Jim C.", 88888888);
        agendaContatos.addContato("Jim", 66666666);
        agendaContatos.addContato("Eddie Murphy", 111111111);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisaPorNome("Jim"));

        System.out.println("Contato Atualizado: " + agendaContatos.atualizarNumeroContato("Eddie Murphy", 77777777));
    }

}