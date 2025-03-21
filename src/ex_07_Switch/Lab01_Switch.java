package ex_07_Switch;

import java.util.Scanner;

public class Lab01_Switch {
    public static void main(String[] args) {
       // Switch

       // Take a user and tell them the day which they have told
        // 1 to 7 => 1 => mon and 5 => fri
        // 8 ? => Not allowed or error
        // for user i/p we are having two types
        //1 CLI - int day = Integer.parsInt(args[0]);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day number from (1 to 7) ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("tue");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("THU");
                break;
            case 5:
                System.out.println("fri");
                break;
                default:
                System.out.println("invalid day");













        }

    }
}
