package space.mavitech.linguagemjava.javacore.Dconstrutores.test;

import space.mavitech.linguagemjava.javacore.Dconstrutores.domain.Anime;

public class AnimeTest01 {

    public static void main(String[] args) {
        Anime anime = new Anime(
                "Dragon Ball", "TV", 519, "Animação", "Fuji Network System");
        anime.imprime();

    }

}