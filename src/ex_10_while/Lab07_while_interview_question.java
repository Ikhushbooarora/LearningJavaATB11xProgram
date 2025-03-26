package ex_10_while;

import java.util.Scanner;

public class Lab07_while_interview_question {
    public static void main(String[] args) {
        // factorial program
        Scanner scanner = new Scanner (System.in);
        System.out.println("welcome to the factorial program+\n+enter the number whose factorial you want!");
        int number = scanner.nextInt();


          int factorial = 1;
          if(number < 0 ){
              System.out.println(factorial);
          }
          else{
              for (int i=1; i<=number;i++){
                  factorial = factorial*i;

              }
              System.out.println("factorial is ->" +factorial);
          }
    }
}
