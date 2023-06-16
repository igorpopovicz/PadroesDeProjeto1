package ABSTRACTFACTORY.factorys;

import ABSTRACTFACTORY.cars.Car;
import ABSTRACTFACTORY.cars.Kicks;
import ABSTRACTFACTORY.cars.March;

public class NissanFactory extends Factory{

    @Override
    Car retrieveCar(String carType, String color) {
        if("SUV".equals(carType)) {
            return new Kicks(color);
        }
        if("Common".equals(carType)){
            return new March(color);
        }
        return null;
    }
    
}
