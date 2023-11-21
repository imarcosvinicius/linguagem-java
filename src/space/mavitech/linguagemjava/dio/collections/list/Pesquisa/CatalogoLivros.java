package space.mavitech.linguagemjava.dio.collections.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private final List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        this.livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisaPorAutor(String autor) {
        if (!livroList.isEmpty()) {
            List<Livro> livroAutor = new ArrayList<>();
            for (Livro livro : livroList) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livroAutor.add(livro);
                }
            }
            return livroAutor;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {

        if (!livroList.isEmpty()) {
            List<Livro> livrosfiltrados = new ArrayList<>();
            for (Livro livro : livroList) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosfiltrados.add(livro);
                }
            }
            return livrosfiltrados;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

    }

    public List<Livro> pesquisaPorTitulo(String titulo) {
        if (!livroList.isEmpty()) {
            List<Livro> livroPorTitulo = new ArrayList<>();
            for (Livro livro : livroList) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo.add(livro);
                    break;
                }
            }
            return livroPorTitulo;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(catalogoLivros.pesquisaPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2020, 2022));
        System.out.println(catalogoLivros.pesquisaPorTitulo("Livro 1"));
    }

}