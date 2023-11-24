package space.mavitech.linguagemjava.javacore.Gassociacao.test;

import space.mavitech.linguagemjava.javacore.Gassociacao.domain.Jogador;
import space.mavitech.linguagemjava.javacore.Gassociacao.domain.Time;

public class JogadorTest02 {

    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Brasil");
        jogador1.setTime(time);
        jogador1.imprime();

    }

}