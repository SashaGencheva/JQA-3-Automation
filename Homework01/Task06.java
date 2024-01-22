package Homework01;

import java.util.Scanner;

public class Task06 {
    public static void DayOfTheWeek(int dayNum) {
        String dayName = "";
        switch(dayNum){
            case 1: dayName = "It's Monday!";
                break;
            case 2: dayName = "It's Tuesday!";
                break;
            case 3: dayName = "It's Wednesday!";
                break;
            case 4: dayName = "It's Thursday!";
                break;
            case 5: dayName = "It's Friday!";
                break;
            case 6: dayName = "It's Saturday!";
                break;
            case 7: dayName = "It's Sunday!";
                break;
            default:System.out.println("Invalid number for a day of the week!");
        }
        System.out.println(dayName);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 1 and 7 for a day of the week:");
        int num = sc.nextInt();
        DayOfTheWeek(num);
        sc.close();
    }
}
