package Homework06;

public class Dog extends Animal {

    private int age;

    public Dog(String family, String type, int numberOfLegs, int age) {
        super(family, type, numberOfLegs);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    void play() {
        System.out.println("Dogs like to play tug of war!");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("Dog says - bow, bow!");
    }

    public void bringStick() {
        System.out.println("Dogs like to bring back sticks!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Age: " + getAge());
    }
}