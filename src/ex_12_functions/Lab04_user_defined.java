package ex_12_functions;

public class Lab04_user_defined {
    public static void main(String[] args) {
    int result1 =sum_of_two_numbers(10,20);
        System.out.println(result1);
        int result2 =sum_of_two_numbers(100,200);
        System.out.println(result2);

    }
    static int sum_of_two_numbers(int a,int b)
    {
        return(a+b);
    }

}
