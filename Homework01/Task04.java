package Homework01;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter working hours: ");
        int workingHours = sc.nextInt();

        System.out.println("Enter amount of money available: ");
        double moneyAmount = sc.nextDouble();

        System.out.println("Is it a day off (true/false)? ");
        boolean dayOff = sc.nextBoolean();

        if (!dayOff) {
            System.out.println("\nWorking hours: " + workingHours + "\nAmount of money: " + moneyAmount + "\nDay off: " + false);
            System.out.print("\nI will work!");
        } else if (moneyAmount <= 0) {
            System.out.println("\nI will stay at home and watch TV!");
        } else if (moneyAmount < 10) {
            System.out.println("\nI will go out for an ice cream! ");
        } else {
            System.out.println("\nI will go to the cinema!");
        }
        sc.close();
    }
}
