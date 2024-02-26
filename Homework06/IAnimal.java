package Homework06;

public interface IAnimal {
    //constant variable
    String KINGDOM = "Animalia";

    //abstract method
    void makeSomeNoise();

    //static method
    static void printMsg() {
        System.out.println( "Kingdom " + KINGDOM + " includes all animal species!");
    }
}