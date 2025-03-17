package ex_04_ternary_operator;

public class Lab05_ternary_opeartorevenorodd {
    public static void main(String[] args) {
        // find the number whether it is even or odd ?
        int num = 10;
        String result = (num%2==0) ? "EVEN" :"ODD";
        System.out.println(result);

        int num1 = 11;
        String result1 = ( num1%2==0 ) ? "EVEN" :"ODD";
        System.out.println(result1);
    }
}
