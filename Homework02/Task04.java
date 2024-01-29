package Homework02;

import java.util.Scanner;

public class Task04 {
    static void printArrayUsingForLoop(int[] array) {
        System.out.println("\nArray elements using for loop are: ");

        for (int index=0; index<array.length; index++) {
            System.out.print(array[index] + " ");
        }
    }

    static void printArrayUsingForEachLoop(int[] array) {
        System.out.println("\nArray elements using for each loop (enhanced for loop) are: ");

        for (int arrVar : array) {
            System.out.print(arrVar + " ");
        }
    }

    static void printArrayUsingWhileLoop(int[] array) {
        System.out.println("\nArray elements using while loop are: ");

        int ind = 0;
        while (ind < array.length) {
            System.out.print(array[ind] + " ");
            ind++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the elements of the array: ");

        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        printArrayUsingForLoop(arr);
        printArrayUsingForEachLoop(arr);
        printArrayUsingWhileLoop(arr);
        sc.close();
    }
}
