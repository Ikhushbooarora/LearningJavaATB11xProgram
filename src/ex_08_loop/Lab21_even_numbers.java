package ex_08_loop;

import java.util.Scanner;

public class Lab21_even_numbers {
    public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
               int n = sc.nextInt();


                System.out.println("enter the numbers from 1 to n:");
                for(int i=1;i<=n;i++){
                    if(i%2==0){
                    System.out.println(i);

                }

            }
        }
}



