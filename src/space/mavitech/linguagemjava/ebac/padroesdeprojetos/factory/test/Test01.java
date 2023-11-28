package space.mavitech.linguagemjava.ebac.padroesdeprojetos.factory.test;

import space.mavitech.linguagemjava.ebac.padroesdeprojetos.factory.domain.*;

public class Test01 {

    public static void main(String[] args) {
        Customer cliente = new Customer("A", false);
        Factory factory = getFactory(cliente);
        Car car = factory.create(cliente.getGradeRequest());
        car.startEngine();
    }

    private static Factory getFactory(Customer cliente) {
        if (cliente.isHasCompanyContrat()) {
            return new WithContract();
        } else {
            return new WithoutContract();
        }
    }

}
