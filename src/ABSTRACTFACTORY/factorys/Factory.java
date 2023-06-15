package ABSTRACTFACTORY.factorys;

import ABSTRACTFACTORY.cars.Car;

public abstract class Factory {
    
    public Car create(String carType) {
        Car car = retrieveCar(carType);
        car = prepareCar(car);
        return car;
    }

    private Car prepareCar(Car car) {
        car.clean();
        car.mechanicCheck();
        car.fuelCar();
        return car;
    }

    abstract Car retrieveCar(String CarType);
}
