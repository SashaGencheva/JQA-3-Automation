package Homework02;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //creating an array in the memory with length of 5
        double[] arr = new double[5];
        System.out.println("Enter the elements of the array: ");

        for (int i=0; i<arr.length; i++) {
            //reading array elements from user input
            arr[i] = Double.parseDouble(sc.nextLine());
        }
        System.out.println("Entered array elements are: ");

        //enhanced for (for each) loop to traverse the array elements
        for (double arrVar : arr) {
            System.out.print(arrVar + " ");
        }
        sc.close();
    }
}
