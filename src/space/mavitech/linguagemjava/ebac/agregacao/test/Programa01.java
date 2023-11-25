package space.mavitech.linguagemjava.ebac.agregacao.test;

import space.mavitech.linguagemjava.ebac.agregacao.domain.Comprador;
import space.mavitech.linguagemjava.ebac.agregacao.domain.Produto;
import space.mavitech.linguagemjava.ebac.agregacao.domain.Venda;
import space.mavitech.linguagemjava.ebac.agregacao.domain.Vendedor;

public class Programa01 {

    public static void main(String[] args) {
        Produto produtoTV = CriarProduto(1L, 1_000d, "TV");
        Produto produtoSmartPhone = CriarProduto(1L, 1_000d, "SmartPhone");

        Vendedor vendedor = criarVendedor("Jim Carrey", 10d);
        Comprador comprador = criarComprador("Eddie Murphy", 2000d);

        Venda venda = new Venda();
        venda.setVendedor(vendedor);
        venda.setComprador(comprador);
        venda.addProduto(produtoTV);
        venda.addProduto(produtoSmartPhone);

        venda.concretizarVenda();
    }

    private static Comprador criarComprador(String nome, Double verba) {
        Comprador comprador = new Comprador();
        comprador.setNome(nome);
        comprador.setVerba(verba);
        return comprador;
    }

    private static Vendedor criarVendedor(String nome, Double comissao) {
        Vendedor vendedor = new Vendedor();
        vendedor.setNome(nome);
        vendedor.setComissao(comissao);
        return vendedor;
    }

    private static Produto CriarProduto(Long codigo, Double valor, String nome) {
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setPreco(valor);
        produto.setNome(nome);

        return produto;
    }

}
