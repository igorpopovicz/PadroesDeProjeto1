package ABSTRACTFACTORY.factorys;

import ABSTRACTFACTORY.cars.Car;
import ABSTRACTFACTORY.cars.Duster;
import ABSTRACTFACTORY.cars.Kwid;

public class RenaultFactory extends Factory {

    @Override
    Car retrieveCar(String carType, String color) {
        if("SUV".equals(carType)) {
            return new Duster(color);
        }
        if("Common".equals(carType)){
            return new Kwid(color);  
        }
        return null;
    }

}

