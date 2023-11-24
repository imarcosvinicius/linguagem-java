package space.mavitech.linguagemjava.ebac.interfacess.test;

import space.mavitech.linguagemjava.ebac.interfacess.domain.CanetaEsferografica;
import space.mavitech.linguagemjava.ebac.interfacess.domain.Giz;
import space.mavitech.linguagemjava.ebac.interfacess.domain.ICaneta;
import space.mavitech.linguagemjava.ebac.interfacess.domain.Lapis;

public class InterfaceTest01 {

    public static void main(String[] args) {
        ICaneta caneta = new CanetaEsferografica();
        ICaneta giz = new Giz();
        ICaneta lapis = new Lapis();

        caneta.escrever("Manoel Gomes");
        System.out.println(caneta.getCor());

        giz.escrever("Bom dia");
        System.out.println(giz.getCor());

        lapis.escrever("Jim Carrey");
        System.out.println(lapis.getCor());
    }

}