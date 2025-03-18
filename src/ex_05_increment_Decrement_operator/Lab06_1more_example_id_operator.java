package ex_05_increment_Decrement_operator;

public class Lab06_1more_example_id_operator {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a); // 10+12 = 22
        System.out.println(a); //a=12


        // Exp A = a++ => Exp A = 10 ; a= 11
        // EXp B = ++a => Exp B = 12 ; a = 12
        // Exp A + Exp B = 10 + 12
        // 5 | 10 | NA
        // 6 | 12 | 22
        // 7 | 12 | NA

    }
}
