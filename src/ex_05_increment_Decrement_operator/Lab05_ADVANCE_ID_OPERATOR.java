package ex_05_increment_Decrement_operator;

import javax.print.attribute.standard.MediaSize;

public class Lab05_ADVANCE_ID_OPERATOR {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + a);

        // A + B
        // A -> a++ -> EXP A -> 10 ; a= 11
        // b -> a -> EXP B -> 11 ; a = 11
        // A+B -> EXP A + EXP B => 10+11 = 21

        //  5 | 10 | na
        // 6 | 11 | 11+10=21
    }
}
