package Homework06;

public abstract class Animal implements IAnimal {
    private String family;
    private String type;
    private int numberOfLegs;

    abstract void play();

    public Animal(String family, String type, int numberOfLegs) {
        this.family = family;
        this.type = type;
        this.numberOfLegs = numberOfLegs;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public void displayInfo() {
        System.out.println("\nAnimal information" + "\nFamily: " + getFamily() + "\nType: " + getType() + "\nNumber of legs: " + getNumberOfLegs());
    }
}