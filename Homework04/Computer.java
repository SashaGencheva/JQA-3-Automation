package Homework04;

public class Computer {

    String name = "";
    int year = 2010;
    double price = 1000.00;
    String operationSystem = "";

    //no-arg constructor
    Computer() {}

    //parameterized constructor
    Computer(String name, int year, double price, String operationSystem) {

        this.name = name;
        this.year = year;
        this.price = price;
        this.operationSystem = operationSystem;

    }

    void display() {

        System.out.println("\nCharacteristics of " + name + ":");
        System.out.println("\tYear: " + year);
        System.out.println("\tPrice: " + price);
        System.out.println("\tOS: " + operationSystem);

    }

    int comparePrice(Computer compare) {

        System.out.println("\nComputer price comparison:");

        if (this.price > compare.price) {

            System.out.println("The price of " + this.name + " is higher than the price of " + compare.name);
            return -1;

        } else if (this.price == compare.price) {

            System.out.println("The price of " + this.name + " and " + compare.name + " are the same");
            return 0;

        } else {

            System.out.println("The price of " + compare.name + " is higher than the price of " + this.name);
            return 1;
        }
    }
}