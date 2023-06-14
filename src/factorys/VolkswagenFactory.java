package factorys;
import cars.Car;
import cars.Gol;
import cars.TCross;

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
