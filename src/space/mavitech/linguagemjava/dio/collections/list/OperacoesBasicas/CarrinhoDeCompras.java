package space.mavitech.linguagemjava.dio.collections.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        if (!itemList.isEmpty()) {
            List<Item> itemsRemover = new ArrayList<>();
            for (Item item : itemList) {
                if (item.getNome().equalsIgnoreCase(nome)) itemsRemover.add(item);
            }
            itemList.removeAll(itemsRemover);
        } else {
            System.out.println("A lista está vázia!");
        }
    }

    public void valorTotal() {
        if (!itemList.isEmpty()) {
            double total = 0.0;
            for (Item item : itemList) {
                total += item.getPreco();
            }
            System.out.println("Valor total: " + total);
        } else {
            System.out.println("Não há protudos no carrinho de compras");
        }
    }

    public void listItens() {
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras compra = new CarrinhoDeCompras();
        compra.adicionarItem("PS5", 4800, 1);
        compra.adicionarItem("JOGO", 199, 5);
        compra.adicionarItem("CONTROLE PS5", 499, 2);
        compra.adicionarItem("CONTROLE PS5", 499, 2);
        compra.listItens();
        compra.removerItem("CONTROLE PS5");
        compra.listItens();
        compra.valorTotal();
    }

}