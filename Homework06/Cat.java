package Homework06;

public class Cat extends Animal {

    private String furColor;

    public Cat(String family, String type, int numberOfLegs, String furColor) {
        super(family, type, numberOfLegs);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    void play() {
        System.out.println("Cats like to play with wool balls!");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("Cat says - meow, meow!");
    }

    public void climb() {
        System.out.println("Cats like to climb!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fur color: " + getFurColor());
    }
}