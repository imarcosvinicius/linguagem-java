package space.mavitech.linguagemjava.javacore.poo.sobrecargametodos.test;

import space.mavitech.linguagemjava.javacore.poo.sobrecargametodos.domain.Anime;

public class AnimeTest01 {

    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Dragon Ball", "TV", 519, "Animação");
        anime.imprime();

    }

}