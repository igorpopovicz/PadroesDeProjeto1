package ABSTRACTFACTORY.factorys;

import ABSTRACTFACTORY.cars.Car;
import ABSTRACTFACTORY.cars.Gol;
import ABSTRACTFACTORY.cars.TCross;

public class VolkswagenFactory extends Factory {

    @Override
    Car retrieveCar(String carType, String color) {
        if("SUV".equals(carType)) {
            return new TCross(color);
        }
        if("Common".equals(carType)){
            return new Gol(color);
        }
        return null;
    }
    
}
