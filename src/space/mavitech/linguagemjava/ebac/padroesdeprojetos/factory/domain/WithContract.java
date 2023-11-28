package space.mavitech.linguagemjava.ebac.padroesdeprojetos.factory.domain;

public class WithContract extends Factory {
    @Override
    Car retriverCar(String requestGrade) {
        if ("A".equals(requestGrade)) {
            return new CorolaCar(100,"full", "Blue");
        } else {
            return null;
        }
    }
}
