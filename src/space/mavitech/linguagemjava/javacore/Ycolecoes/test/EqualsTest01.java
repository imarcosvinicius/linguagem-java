package space.mavitech.linguagemjava.javacore.Ycolecoes.test;

import space.mavitech.linguagemjava.javacore.Ycolecoes.domain.Smartphone;

public class EqualsTest01 {

    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "Iphone");
        Smartphone s2 = new Smartphone("1ABC1", "Iphone");

        System.out.println(s1.equals(s2));

    }

}