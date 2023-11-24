package space.mavitech.linguagemjava.ebac.interfacess.domain;

public class CarroPasseio implements IAutomovel {

    @Override
    public void reduzirVelocidade() {
        System.out.println("Reduzindo velocidade");
    }
}