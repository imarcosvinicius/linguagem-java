package space.mavitech.linguagemjava.ebac.agregacao.domain;

import java.util.ArrayList;
import java.util.List;

public class Venda {

    private Comprador comprador;
    private Vendedor vendedor;
    private List<Produto> produtos;

    public Venda() {
        this.produtos = new ArrayList<>();
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void concretizarVenda() {
        System.out.println("Comprador: " + this.comprador.getNome());
        System.out.println("Comprou os itens: ");
        for (Produto p: this.produtos) {
            System.out.println("Produto: " + p.getNome() + ", Valor Produto: " + p.getPreco());
        }
        System.out.println("Vendedor: " + this.vendedor.getNome());
    }

    public void cancelarVenda() {
        System.out.println("Venda cancelada");
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }
}
