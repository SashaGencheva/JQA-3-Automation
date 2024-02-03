package Homework03;

import java.util.Scanner;

public class CarPerson {
    public static void main(String[]args) {

        Car car1 = new Car();
        car1.year = 2005;
        car1.price = 7500;
        car1.fuelTankCapacity = 50;
        car1.freeFuel = 20;
        car1.engineFuelOperationSystem = "Diesel";

        System.out.println("\nFirst car characteristics");
        car1.display();

        Car car2 = new Car(2010, 10000, true, 60, 55, "Gasoline");
        System.out.println("\nSecond car characteristics");
        car2.display();

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter used fuel: ");
        double usedFuel = Double.parseDouble(sc.nextLine());

        //calling useFuel() method for car1 and car2
        System.out.println("\nNew free fuel of first car is: ");
        car1.useFuel(usedFuel);
        System.out.println("\nNew free fuel of second car is: ");
        car2.useFuel(usedFuel);

        System.out.println("\nEnter new engine fuel operating system of second car: ");
        String engineFuelOS = sc.nextLine();

        //changing engine fuel operating system of car2
        System.out.println("\nNew engine fuel operating system of second car is: ");
        car2.changeEngineFuelOperationSystem(engineFuelOS);

        //displaying characteristics of car1 and car2
        System.out.println("\nNew characteristics of first car");
        car1.display();
        System.out.println("\nNew characteristics of second car");
        car2.display();
        sc.close();
    }
}
