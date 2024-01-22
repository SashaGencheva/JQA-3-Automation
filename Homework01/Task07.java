package Homework01;

public class Task07 {
    public static void main(String[] args) {
        //Numbers from 1 to 100 without range 54 - 74
        System.out.println("Numbers from 1 to 100 without range (54 - 74):");
        for (int i = 1; i<=100; i++) {
            if ((i >= 54) && (i <= 74)) {
                continue;
            }
            System.out.println(i);
        }
    }
}
