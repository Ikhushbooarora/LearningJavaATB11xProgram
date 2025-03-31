package ex_08_loop;

import java.util.Scanner;

public class Lab24_prime_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isprime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isprime = false;
                break;
            }
        }
        if (isprime) {
            if (n == 1) {
                System.out.println("neither prime number nor composite number");
            } else {
                System.out.println("this is a prime number");
            }
        }
            else{
                System.out.println("this is not a prime number");
            }



    }
}
