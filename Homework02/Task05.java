package Homework02;

import java.util.Arrays;

public class Task05 {
    static  void arrayCopyUsingClone(int[] arrOrg) {
        //Array copy using clone() method
        int[] arrCopy1 = arrOrg.clone();

        System.out.println("\nCopied array using clone() method is: ");
        for (int arrCopy1Var : arrCopy1) {
            System.out.print(arrCopy1Var + " ");
        }
    }

    static void arrayCopyUsingArraycopy(int[] arrOrg) {
        //Array copy using System.arraycopy() method
        int[] arrCopy2 = new int[arrOrg.length];
        System.arraycopy(arrOrg, 0, arrCopy2, 0, 5);

        System.out.println("\nCopied array using System.arraycopy() method is: ");
        for (int arrCopy2Var : arrCopy2) {
            System.out.print(arrCopy2Var + " ");
        }
    }

    static void arrayCopyUsingCopyOf(int[] arrOrg) {
        //Array copy using Arrays.copyOf() method
        int[] arrCopy3 = Arrays.copyOf(arrOrg, 5);

        System.out.println("\nCopied array using Arrays.copyOf() method is: ");
        for (int arrCopy3Var : arrCopy3) {
            System.out.print(arrCopy3Var + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 12, 1, 8, 4};

        System.out.println("\nOriginal array is: ");
        for (int arrVar : arr) {
            System.out.print(arrVar + " ");
        }
        arrayCopyUsingClone(arr);
        arrayCopyUsingArraycopy(arr);
        arrayCopyUsingCopyOf(arr);
    }
}
