package space.mavitech.linguagemjava.ebac.interfacess.domain;

public interface IAutomovel {

    default void acelerar() {
        System.out.println("Veículo acelerando");
    }

    public void reduzirVelocidade();

}