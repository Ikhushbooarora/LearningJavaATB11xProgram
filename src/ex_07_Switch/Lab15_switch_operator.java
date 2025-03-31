package ex_07_Switch;

import java.util.Scanner;

public class Lab15_switch_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number a:");
        int a = sc.nextInt();
        System.out.println("enter the number  b : ");
        int b = sc.nextInt();


        System.out.println("choose the operation from 1 to 5:");
        System.out.println("1: addition");
        System.out.println("2: subtraction");
        System.out.println("3: multiplication");
        System.out.println("4: division");
        System.out.println("modulus");
        System.out.println("enter you operator from 1/2/3/4/5:");
        int operator = sc.nextInt();


        switch(operator) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                if (b == 0) {
                    System.out.println("invalid division");
                } else {
                    System.out.println(a / b);
                }
                break;
            case 5:
                if (b == 0) {
                    System.out.println("invalid mod");
                } else {
                    System.out.println(a % b);
                }
                break;
            default:
                System.out.println("invalid operation");


        }

    }
}
