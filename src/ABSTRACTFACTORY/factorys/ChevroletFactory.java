package ABSTRACTFACTORY.factorys;

import ABSTRACTFACTORY.cars.Car;
import ABSTRACTFACTORY.cars.Prisma;
import ABSTRACTFACTORY.cars.Tracker;

public class ChevroletFactory extends Factory {

    @Override
    Car retrieveCar(String carType, String color) {
        if("SUV".equals(carType)) {
            return new Tracker(color);
        }
        if("Common".equals(carType)){
            return new Prisma(color);
        }
        return null;
    }

}