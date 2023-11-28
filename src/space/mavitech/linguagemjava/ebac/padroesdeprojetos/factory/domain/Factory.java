package space.mavitech.linguagemjava.ebac.padroesdeprojetos.factory.domain;

public abstract class Factory {

    public Car create(String requestedGrade) {
        Car car = retriverCar(requestedGrade);
        car = prepareCar(car);
        return car;
    }

    private Car prepareCar(Car car) {
        car.clean();
        car.mechanicCheck();
        car.fuelCar();
        return car;
    }

    abstract Car retriverCar(String requestGrade);

}
