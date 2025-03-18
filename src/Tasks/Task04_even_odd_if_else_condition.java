package Tasks;

import java.util.Scanner;

public class Task04_even_odd_if_else_condition {
    //create a program
    // take user input
    // check whether the number is even or odd

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int number = scanner.nextInt();
        System.out.println(number);

        if (number%2 == 0)
        {
            System.out.println("number is even"); // number 4 is even
        }
        else{
            System.out.println("number is odd"); //  number 5 is odd
        }

    }
}
