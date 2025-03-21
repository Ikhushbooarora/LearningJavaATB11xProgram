package ex_07_Switch;

import java.util.Scanner;

public class Lab02_Switch_without_break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day no. (1 to 7 ");
        int day = scanner.nextInt();

        switch (day){

            case 1 :
                System.out.println("mon");
            case 2 :
                System.out.println("tue");
            case 3 :
                System.out.println("wed");
            case 4:
                System.out.println("thu");
            case 5:
                System.out.println("fri");
            case 6:
                System.out.println("sat");
            case 7:
                System.out.println("sun");
            case 8:
                System.out.println("not a valid day");
        }




    }
}
