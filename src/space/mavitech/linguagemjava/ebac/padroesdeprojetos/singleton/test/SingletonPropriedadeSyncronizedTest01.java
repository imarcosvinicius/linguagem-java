package space.mavitech.linguagemjava.ebac.padroesdeprojetos.singleton.test;

import space.mavitech.linguagemjava.ebac.padroesdeprojetos.singleton.domain.SingletonPropriedade;
import space.mavitech.linguagemjava.ebac.padroesdeprojetos.singleton.domain.SingletonPropriedadeSyncronized;

public class SingletonPropriedadeSyncronizedTest01 {

    public static void main(String[] args) {
        Thread t1 = new Thread(new SingletonPropriedadeSyncronizedTest01.TreadFoo());
        Thread t2 = new Thread(new SingletonPropriedadeSyncronizedTest01.ThreadBar());
        t1.start();
        t2.start();
    }

    static class TreadFoo implements Runnable {

        @Override
        public void run() {
            SingletonPropriedadeSyncronized singletonPropriedadeSyncronized = SingletonPropriedadeSyncronized.getSingletonPropriedadeSyncronized("Test01");
            System.out.println(singletonPropriedadeSyncronized.getValue());
        }
    }

    static class ThreadBar implements Runnable {

        @Override
        public void run() {
            SingletonPropriedadeSyncronized singletonPropriedadeSyncronized = SingletonPropriedadeSyncronized.getSingletonPropriedadeSyncronized("Test02");
            System.out.println(singletonPropriedadeSyncronized.getValue());
        }
    }

}
