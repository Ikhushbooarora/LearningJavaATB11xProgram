package ex_04_ternary_operator;

public class Lab03_interviewreadyquestion {
    public static void main(String[] args) {
        //Nested Ternary
        //result= condition1 ? expression1 : (Condition2 ? expression2 : expression3);
        int number = 15;
        String result = (number>10)? "A" :"B";
        System.out.println(result);

        int number1 = 25;
        String result1 = (number1 > 10)? (number1 > 20 ? "number1>20" : "number1<20") :"A";
        System.out.println(result1);

    }
}
