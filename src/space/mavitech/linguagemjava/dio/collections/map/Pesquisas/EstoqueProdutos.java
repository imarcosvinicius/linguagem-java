package space.mavitech.linguagemjava.dio.collections.map.Pesquisas;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private final Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotal = 0.0;
        if (!estoqueProdutosMap.isEmpty()) {

            for (Produto p : estoqueProdutosMap.values()) {
                valorTotal += p.getQuantidade() * p.getPreco();
            }
        }

        return valorTotal;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        } else {
            System.out.println("Lista Vazia.");
        }

        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1, "Produto A", 10, 5.0);
        estoqueProdutos.adicionarProduto(2, "Produto B", 5, 10.0);
        estoqueProdutos.adicionarProduto(3, "Produto C", 2, 15.0);
        estoqueProdutos.adicionarProduto(4, "Produto ", 2, 15.0);
        estoqueProdutos.adicionarProduto(4, "Produto D", 2, 20.0);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do estoque: R$ " + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: R$ " + estoqueProdutos.obterProdutoMaisCaro());
    }
}