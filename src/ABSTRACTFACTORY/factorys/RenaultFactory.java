package ABSTRACTFACTORY.factorys;

import ABSTRACTFACTORY.cars.Car;
import ABSTRACTFACTORY.cars.Duster;
import ABSTRACTFACTORY.cars.Kwid;

public class RenaultFactory extends Factory {

    @Override
    Car retrieveCar(String CarType) {
        if("SUV".equals(CarType)) {
            return new Duster("Black");
        }
        if("Common".equals(CarType)){
            return new Kwid("Yellow");  
        }
        return null;
    }

}

