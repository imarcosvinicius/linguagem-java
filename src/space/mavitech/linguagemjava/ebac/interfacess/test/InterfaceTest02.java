package space.mavitech.linguagemjava.ebac.interfacess.test;

import space.mavitech.linguagemjava.ebac.interfacess.domain.Caminhao;
import space.mavitech.linguagemjava.ebac.interfacess.domain.CarroPasseio;
import space.mavitech.linguagemjava.ebac.interfacess.domain.IAutomovel;

public class InterfaceTest02 {

    public static void main(String[] args) {
        IAutomovel carro = new CarroPasseio();
        IAutomovel caminhao = new Caminhao();

        carro.acelerar();
        carro.reduzirVelocidade();

        caminhao.acelerar();
        caminhao.reduzirVelocidade();
    }

}
