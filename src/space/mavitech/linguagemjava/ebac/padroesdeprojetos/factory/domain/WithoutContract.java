package space.mavitech.linguagemjava.ebac.padroesdeprojetos.factory.domain;

public class WithoutContract extends Factory {
    @Override
    Car retriverCar(String requestGrade) {
        if ("A".equals(requestGrade)) {
            return new CivicTypeRCar(100,"full", "Blue");
        } else {
            return null;
        }
    }
}
