package ex_10_while;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Lab08_while_guessing_game {
    public static void main(String[] args) {
        // guess a number between 1 and 10

        Random random = new Random();
        int numberToGuess = random.nextInt(10) + 1;
        System.out.println(numberToGuess);
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a number");


        int guess;
        int attempts = 0;

        while (true) {
            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low, try again");
            } else if (guess > numberToGuess) {
                System.out.println("Too high, try again");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts");
                break;
            }

        }





    }
}
