package ex_05_increment_Decrement_operator;

import java.sql.SQLOutput;

public class Lab01_incrementoperator {
    public static void main(String[] args) {
        // Expression and Result table
        // Line no. | Value of a | Result (b)
        // take inputs
        String age = args[0];
        String a1 = args[1];
        String a2 = args[2];
        String a3 = args [3]; // java language array index out of boundary exception because for 3rd argument we didnt gave any input .

        int age1 = Integer.parseInt(age);
        System.out.println(age1);
        System.out.println(a1);
        System.out.println(a2);
    }
}
