package space.mavitech.linguagemjava.ebac.padroesdeprojetos.singleton.test;

import space.mavitech.linguagemjava.ebac.padroesdeprojetos.singleton.domain.SingletonPropriedade;

public class SingletonPropriedadeThread {

    public static void main(String[] args) {
        Thread t1 = new Thread(new TreadFoo());
        Thread t2 = new Thread(new ThreadBar());
        t1.start();
        t2.start();
    }

    static class TreadFoo implements Runnable {

        @Override
        public void run() {
            SingletonPropriedade singletonPropriedade = SingletonPropriedade.getSingletonPropriedade("Test01");
            System.out.println(singletonPropriedade.getValue());
        }
    }

    static class ThreadBar implements Runnable {

        @Override
        public void run() {
            SingletonPropriedade singletonPropriedade = SingletonPropriedade.getSingletonPropriedade("Test02");
            System.out.println(singletonPropriedade.getValue());
        }
    }

}
