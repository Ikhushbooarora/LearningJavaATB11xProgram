package ex_if_condition;

import java.util.Scanner;

public class Lab04_if_else_condition {
    public static void main(String[] args) {
        // how to take the user input
        //1. CLI option
        // int age = Integer.parseInt(args[0]);
        // 2. Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println(age);

        if (age>18){
            System.out.println("you are allowed to vote!");
        }
        else{
            System.out.println("No you are not allowed to vote!");
        }

   }
}
