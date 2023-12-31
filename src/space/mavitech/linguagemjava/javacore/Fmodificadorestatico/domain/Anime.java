package space.mavitech.linguagemjava.javacore.Fmodificadorestatico.domain;

public class Anime {

    private String nome;
    private static int[] episodios;

    static {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int ep : Anime.episodios) {
            System.out.print(ep + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}