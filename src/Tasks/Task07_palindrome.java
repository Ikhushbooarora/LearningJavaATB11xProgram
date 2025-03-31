package Tasks;

import java.util.Scanner;

public class Task07_palindrome {
    public static void main(String[] selenium) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input,I will check palindrome");
        String userInput = sc.next();
        String newstring = reversestring(userInput);
        if (newstring.equalsIgnoreCase(userInput)){
            System.out.println("Palindrome");

        }else
        {
            System.out.println ("not a palindrome");
        }


    }

    private static String reversestring(String userInput) {
        String reversed = "";
        for (int i = userInput.length() - 1; i >= 0; i--) {
            reversed = reversed + userInput.charAt(i);

        }
        return reversed;
    }

    private static String reversestringSB(String userInput) {
        StringBuilder stringBuilder = new StringBuilder(userInput);
        return stringBuilder.reverse().toString();
    }
    }




