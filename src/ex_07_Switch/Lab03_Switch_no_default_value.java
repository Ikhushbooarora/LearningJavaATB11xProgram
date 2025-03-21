package ex_07_Switch;

import java.util.Scanner;

public class Lab03_Switch_no_default_value {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day number from (1 to 7)");
        int day = scanner.nextInt();

        switch (day)

    {
        case 1:
            System.out.println("mon");
            break;
        case 2:
            System.out.println("tue");
            break;
    }
    }
}
