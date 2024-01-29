package Homework02;

import java.util.Scanner;

public class Task02 {
    static double printAverage(double num1, double num2) {
        double avr = (num1 + num2)/2;
        return avr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double number1 = Double.parseDouble(sc.nextLine());

        System.out.print("Enter second number: ");
        double number2 = Double.parseDouble(sc.nextLine());

        System.out.print("The average of " + number1 + " and " + number2 + " is: " + printAverage(number1, number2));
        sc.close();
    }
}
