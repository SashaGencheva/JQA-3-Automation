package Homework02;

import java.util.Arrays;

public class Task06 {
    static boolean isEqual(int[] arr1, int[] arr2) {
        //comparing array size and elements one by one
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }

    static void compareArrayUsingEquals(int[] arr1, int[] arr2) {
        //Array compare using Arrays.equals() method
        if(Arrays.equals(arr1, arr2)) {
            System.out.println("\nArrays are equal (using equals() method)!");
        } else {
            System.out.println("\nArrays are not equals (using equals() method)!");
        }
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        System.out.println("\nFirst arrays is: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println("\nSecond array is: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

        //calling isEqual() method
        if (isEqual(array1, array2)) {
            System.out.print("\nArrays are equal (comparing elements one by one)!");
        }else {
            System.out.print("\nArrays are not equals (comparing elements one by one)!");
        }

        //calling compareArrayUsingEquals() method
        compareArrayUsingEquals(array1, array2);
    }
}
