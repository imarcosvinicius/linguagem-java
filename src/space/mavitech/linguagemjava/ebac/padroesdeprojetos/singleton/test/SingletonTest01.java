package space.mavitech.linguagemjava.ebac.padroesdeprojetos.singleton.test;

import space.mavitech.linguagemjava.ebac.padroesdeprojetos.singleton.domain.Singleton;

public class SingletonTest01 {

    public static void main(String[] args) {
        Singleton singleton01 = Singleton.getSingleton();
        Singleton singleton02 = Singleton.getSingleton();
        System.out.println(singleton01);
        System.out.println(singleton02);
    }

}