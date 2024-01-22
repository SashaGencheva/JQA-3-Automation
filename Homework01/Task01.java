package Homework01;

import java.util.Scanner;

public class Task01 {

    public static void CheckBetweenFirstAndSecond(int first, int second, int third)
    {
        int minNum = Math.min(first,second);
        int maxNum = Math.max(first,second);

        if ((third > minNum) && (third < maxNum)) {
            System.out.println("The third number " + third + " is between " + minNum + " and " + maxNum);
        } else {
            System.out.println("The third number " + third + " is not between " + minNum + " and " + maxNum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("First entered number is: " + num1);

        System.out.println("\nEnter second number: ");
        int num2 = sc.nextInt();

        //entered numbers should be different
        while (num2 == num1){
            System.out.println("\nEnter new second number different than " + num1 + ":");
            num2 = sc.nextInt();
        }
        System.out.println("\nSecond entered number is: " + num2);

        System.out.println("\nEnter third number: ");
        int num3 = sc.nextInt();

        //entered numbers should be different
        while ((num3 == num2) || (num3 == num1)){
            System.out.println("\nEnter new third number different than " + num1 + " or " + num2 + ":");
            num3 = sc.nextInt();
        }
        System.out.println("\nThird entered number is: " + num3);

        System.out.println("\nEntered numbers are: " + num1 + ", " + num2 + ", " + num3);
        CheckBetweenFirstAndSecond(num1, num2, num3);
        sc.close();
    }
}
