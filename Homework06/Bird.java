package Homework06;

public class Bird extends Animal {

    private String wingsColor;

    public Bird(String family, String type, int numberOfLegs, String wingsColor) {
        super(family, type, numberOfLegs);
        this.wingsColor = wingsColor;
    }

    public String getWingsColor() {
        return wingsColor;
    }

    public void setWingsColor(String wingsColor) {
        this.wingsColor = wingsColor;
    }

    @Override
    void play() {
        System.out.println("Birds like to play in the mud!");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("Bird says - tweet, tweet!");
    }

    public void fly() {
        System.out.println("Birds can fly!");
    }

    public void sing() {
        System.out.println("One bird is singing quietly!");
    }

    //overloading sing() methods
    public void sing(int numberOfBirds) {
        if (numberOfBirds > 1) {
            System.out.println(numberOfBirds + " birds are singing loudly!");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Wings color: " + getWingsColor());
    }
}