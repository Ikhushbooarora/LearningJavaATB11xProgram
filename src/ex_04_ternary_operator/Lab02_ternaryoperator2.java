package ex_04_ternary_operator;

public class Lab02_ternaryoperator2 {
    public static void main(String[] args) {
       // Teranry operator = result = condition? expression1 : expression2;
        int number = -3;
        String result = number>0?"positive": "negative";
        System.out.println(result);
    }
}
