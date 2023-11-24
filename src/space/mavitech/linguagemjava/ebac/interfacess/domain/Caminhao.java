package space.mavitech.linguagemjava.ebac.interfacess.domain;

public class Caminhao implements IAutomovel {
    @Override
    public void acelerar() {
        System.out.println("Caminhão acelerando");
    }

    @Override
    public void reduzirVelocidade() {
        System.out.println("Reduzindo velocidade");
    }

}