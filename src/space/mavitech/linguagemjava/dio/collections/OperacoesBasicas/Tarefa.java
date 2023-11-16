package space.mavitech.linguagemjava.dio.collections.OperacoesBasicas;

public class Tarefa {

    private String descricacao;

    public Tarefa(String descricacao) {
        this.descricacao = descricacao;
    }

    public String getDescricacao() {
        return descricacao;
    }

    @Override
    public String toString() {
        return descricacao;
    }
}