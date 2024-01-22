package Homework01;

import java.util.Scanner;

public class Task03 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        System.out.println("Enter third number:");
        int num3 = sc.nextInt();

        System.out.println("\nNumbers before swapping: " +num1 + ", " + num2 + ", " + num3);

        //swapping num1 --> num2, num2 --> num3, num3 --> num1
        int var;
        var = num1;
        num1 = num2;
        System.out.println("\nFirst number after swapping: " + num1);
        num2 = num3;
        System.out.println("Second number after swapping: " + num2);
        num3 = var;
        System.out.println("Third number after swapping: " + num3);

        //Sum of num1 and num2
        int sum = num1 + num2;
        System.out.println("\nSum of first and second number: \n(" + num1 + "+" + num2 + ")=" + sum);

        //Difference between sum and num3
        int diff = sum - num3;
        System.out.println("\nDifference between sum of first two numbers and third number: \n(" + sum + "-" + num3 +")=" + diff);
    }
}
