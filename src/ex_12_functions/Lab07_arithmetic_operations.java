package ex_12_functions;

import java.util.Scanner;

public class Lab07_arithmetic_operations {
    public static void main(String[] args) {
        // create a function of sub , sum , mul , div
        // with parameters a and b (take the parameter from the user )
        // logic building


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1 ");
        int a = 0 ;              // in java local variable should be initialised
        if(sc.hasNextInt()){
            a=sc.nextInt();
        }else{
            System.out.println("Enter the int only ");
            System.exit(0);
        }

        int b = 0 ;
        if(sc.hasNextInt()){
            b=sc.nextInt();
        }else{
            System.out.println("Enter the int only ");
            System.exit(0);
        }

        int result_sum= sum(a,b);
        int result_sub = sub(a,b);
        int result_mul = mul(a,b);
        int result_div = div(a,b);
        int result_mod = mod(a,b);


        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_div);
        System.out.println(result_mod);

    }
        static int sum(int a , int b){
            return a+b;
        }
        static int sub(int a , int b){
        return a-b;
        }
        static int mul(int a , int b){
        return a*b;
        }
        static int div(int a , int b){
        if(b==0) {
            System.out.println("div by zero is not allowed ");
            System.exit(0);
        }
               return a/b;
    }
    static int mod (int a , int b) {
        return a % b;
    }
    }
