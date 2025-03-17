package ex_04_ternary_operator;

import java.sql.SQLOutput;

public class Lab04_ternaryoperator {
    public static void main(String[] args) {
        //find the maximum number between two numbers?
        int x = 20;
        int y = 30;
        System.out.println(Math.max(x,y));

        int max = x>y?x:y;
        System.out.println(max);

        String max2 = x>y? "x":"y";
        System.out.println(max2);
    }
}
