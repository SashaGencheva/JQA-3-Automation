package Homework04;

public class ComputerPrice {
    public static void main (String[] args) {

        Computer comp1 =  new Computer();
        comp1.name = "PC1";
        comp1.year = 2015;
        comp1.price = 1500.59;
        comp1.operationSystem = "Linux";
        comp1.display();

        Computer comp2 = new Computer("PC2",2020, 1675.68, "Windows");
        comp2.display();

        System.out.println(comp1.comparePrice(comp2));

    }
}
