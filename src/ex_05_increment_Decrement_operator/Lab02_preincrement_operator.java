package ex_05_increment_Decrement_operator;

import javax.print.attribute.standard.MediaSize;

public class Lab02_preincrement_operator {
    public static void main(String[] args) {
        // pre- increment -> ++operand
        // value is increased first and then stored in the result.
        //value is increased by 1 .
        int a = 10;
        int b = ++a;
        System.out.println(b); // output ->11
        System.out.println(a);// output -> 11



        // Expression and Result table
        // Line no. | Value of a | Result (b)

        // 10 | 10 | NA
        // 11 | 11 | 11
        // 12 | 11 (NA) | 11  - > NA shows the expression or that variable is not present in that line but the value of that expression or variable is there.
        // 13 |11 | 11/( NA )

    }
}
