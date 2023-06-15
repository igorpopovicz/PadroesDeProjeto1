package ABSTRACTFACTORY.factorys;

import ABSTRACTFACTORY.cars.Car;
import ABSTRACTFACTORY.cars.Gol;
import ABSTRACTFACTORY.cars.TCross;

public class VolkswagenFactory extends Factory {

    @Override
    Car retrieveCar(String requestedGrade) {
        if("SUV".equals(requestedGrade)) {
            return new TCross("Purple");
        }
        if("Common".equals(requestedGrade)){
            return new Gol("White");
        }
        return null;
    }
    
}
