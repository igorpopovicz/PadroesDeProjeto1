package ABSTRACTFACTORY.cars;

public abstract class Car {
    private String name;
    private String color;
    private int horsePower;
    private int fuelCapacity;

    public Car(int horsePower, int fuelCapacity, String color, String name) {
        this.horsePower = horsePower;
        this.fuelCapacity = fuelCapacity;
        this.color = color;
        this.name = name;
    }

    public String getName() {
       return this.name;
    }

    public String getHorsePower() {
        return this.horsePower + "HP";
    }

    public String getFuelCapacity() {
        return this.fuelCapacity + "L";
    }

    public String getColor() {
        return this.color;
    }
}
