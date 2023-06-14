package cars;
public abstract class Car {
    private int horsePower;
    private int fuelCapacity;
    private String color;

    public Car(int horsePower, int fuelCapacity, String color) {
        this.horsePower = horsePower;
        this.fuelCapacity = fuelCapacity;
        this.color = color;
    }

    public void startEngine() {
        System.out.println("The " + this.getClass().getName() +
                            "'s engine has been Started. He has " +
                             this.horsePower + " horse power.");
    }

    public void clean() {
        System.out.println("Car has been cleaned, and the " + this.color +
                            " color shines \u2606\u2606");
    }

    public void mechanicCheck() {
        System.out.println("Car has been checked the engine, Everything looks good!");
    }

    public void fuelCar() {
        System.out.println("Car is being filled with " + this.fuelCapacity + "L");
    }
}
