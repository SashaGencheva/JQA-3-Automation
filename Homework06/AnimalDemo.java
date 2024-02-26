package Homework06;

public class AnimalDemo {
    public static void main(String[] args) {
        Bird birdie = new Bird("Birds", "wild animal", 2, "green");
        Cat kitty = new Cat("Cats", "domestic animal", 4, "grey");
        Dog doggy = new Dog("Dogs", "domestic animal", 4, 10);

        IAnimal.printMsg();
        birdie.displayInfo();
        birdie.play();
        birdie.makeSomeNoise();
        birdie.fly();
        birdie.sing();
        birdie.sing(5);

        kitty.displayInfo();
        kitty.play();
        kitty.makeSomeNoise();
        kitty.climb();

        doggy.displayInfo();
        doggy.play();
        doggy.makeSomeNoise();
        doggy.bringStick();

    }
}