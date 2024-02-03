package Homework03;

public class Car {

    int year = 2000;
    double price = 15000.5;
    boolean isSport;
    double fuelTankCapacity = 70;
    double freeFuel = 50;
    String engineFuelOperationSystem = "";

    //no-arg constructors
    public Car() {

    }

    //Parameterized constructor
    public Car(int year, double price, boolean isSport, double fuelTankCapacity,
               double freeFuel, String engineFuelOperationSystem) {

        this.year = year;
        this.price = price;
        this.isSport = isSport;
        this.fuelTankCapacity = fuelTankCapacity;
        this.freeFuel = freeFuel;
        this.engineFuelOperationSystem = engineFuelOperationSystem;
    }

     public void display() {

        System.out.println("\tYear: " + year);
        System.out.println("\tPrice: " + price);
        System.out.println("\tSport car: " + isSport);
        System.out.println("\tFuel tank capacity: " + fuelTankCapacity);
        System.out.println("\tFree available fuel: " + freeFuel);
        System.out.println("\tEngine fuel operating system: " + engineFuelOperationSystem);
    }

    public void changeEngineFuelOperationSystem(String newEngineFuelOperationSystem) {

        engineFuelOperationSystem = newEngineFuelOperationSystem;
        System.out.println(newEngineFuelOperationSystem);
    }

    public void useFuel(double fuel) {

        if (fuel < freeFuel) {
            System.out.println(freeFuel-= fuel);
        } else {
            freeFuel = 0;
            System.out.println("Not enough fuel!");
        }
    }
}
