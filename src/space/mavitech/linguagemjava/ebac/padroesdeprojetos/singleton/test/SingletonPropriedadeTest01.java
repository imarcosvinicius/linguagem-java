package space.mavitech.linguagemjava.ebac.padroesdeprojetos.singleton.test;

import space.mavitech.linguagemjava.ebac.padroesdeprojetos.singleton.domain.SingletonPropriedade;

public class SingletonPropriedadeTest01 {

    public static void main(String[] args) {
        SingletonPropriedade singletonPropriedade01 = SingletonPropriedade.getSingletonPropriedade("Test01");
        SingletonPropriedade singletonPropriedade02 = SingletonPropriedade.getSingletonPropriedade("Test01");

        System.out.println(singletonPropriedade01.getValue());
        System.out.println(singletonPropriedade02.getValue());
    }

}
