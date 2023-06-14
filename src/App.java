import cars.Car;
import factorys.*;

public class App {
    public static void main(String[] args) throws Exception {
        Customer customerOne = new Customer("Common", Customer.RENAULT);
        Factory factory = getCarFactory(customerOne);
        Car carOne = factory.create(customerOne.getGradeRequest());
        carOne.startEngine();
    }

    private static Factory getCarFactory(Customer customer) {
        if(customer.getCompany() == Customer.RENAULT) {
            return new RenaultFactory();
        }
        if(customer.getCompany() == Customer.VOLKSWAGEN) {
            return new VolkswagenFactory();
        }
        return null;
    }
}
