package Homework02;

import java.util.Scanner;

public class Task01 {
    public static void printSum(int num1, int num2){
        int sum = num1 + num2;
        System.out.printf("The sum of %d and %d is: %d", num1, num2, sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = Integer.parseInt(sc.nextLine());

        System.out.print("Enter second number: ");
        int number2 = Integer.parseInt(sc.nextLine());

        //calling printSum method with two entered numbers as arguments
        printSum(number1, number2);
        sc.close();
    }
}
