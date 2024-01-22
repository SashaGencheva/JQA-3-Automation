package Homework01;

import java.util.Scanner;

public class Task02 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        System.out.println("Enter third number:");
        double num3 = sc.nextDouble();

        System.out.println("Enter fourth number:");
        double num4 = sc.nextDouble();

        System.out.println("\nNumbers before swapping: " + num1 + "; " + num2 + "; " + num3 + "; "+ num4);

        //swapping int num1 and int num2
        int varInt;
        varInt = num1;
        num1 = num2;
        num2 = varInt;

        //swapping double num3 and double num4
        double varDouble;
        varDouble = num3;
        num3 = num4;
        num4 = varDouble;
        System.out.println("Numbers after swapping: " + num1 + "; " + num2 + "; " + num3 + "; " + num4);

        //casting int (num2 and num2) to double
        double newTypeNum1 = num1;
        double newTypeNum2 = num2;
        System.out.println("\nNumbers after casting int to double: " + newTypeNum1 +"; " + newTypeNum2 + "; " + num3 + "; " + num4);
        double sum1 = newTypeNum1 + newTypeNum2 + num3 +num4;
        System.out.println("Sum after casting int to double: " + sum1);

        //casting double (num3 and num4) to int
        int newTypeNum3 = (int) num3;
        int newTypeNum4 = (int) num4;
        System.out.println("\nNumbers after casting double to int: " + num1 + "; " + num2 + "; " + newTypeNum3 + "; " + newTypeNum4);
        int sum2 = num1 + num2 + newTypeNum3 + newTypeNum4;
        System.out.println("Sum after casting double to int: " + sum2);
    }
}
