package ABSTRACTFACTORY.factorys;

import ABSTRACTFACTORY.cars.Car;

public abstract class Factory {
    
    public Car create(String carType, String color) {
        Car car = retrieveCar(carType, color);
        return car;
    }

    abstract Car retrieveCar(String carType, String color);
}
