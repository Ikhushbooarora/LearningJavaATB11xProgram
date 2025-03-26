package ex_12_functions;

public class Lab05_user_defined_part1 {
    public static void main(String[] args) {
        //User defined functions
        // 1. without parameters and without return type
        // 2. without parameters and with return type
        // 3. with parameters and without return type
        //4. with parameters and with return type

        wp_wr_greet();


       String msg = greet_with_hello_wp_with_RT();
        System.out.println(msg);
        greet_with_details( "Mohamed" , 25 , 10000);
        greet_with_details( "Ali" , 26 , 12000);
        greet_with_fullname("Mohamed","Ali");
        int result = sum_of_two_numbers(10,20);
        System.out.println(result);

    }
    static void wp_wr_greet()
    {
        System.out.println("Hello World");
    }
// 2. without parameters and with return type
    static String greet_with_hello_wp_with_RT() {
        System.out.println("Hi");
        return ("Hi,How are you?");
    }

    // 3. with parameters and without return type (mostly used )

    static void greet_with_details(String name, int age , double salary){
        System.out.println("your name is :" +name+"\n" +"your age is :" +age+"\n" + "your salary is :"+salary);

    }
    static void greet_with_fullname(String name , String lastname){
        System.out.println("your full name is :" +name+" "+lastname);
    }

    //4. with parameters and with return type
    static int sum_of_two_numbers(int a,int b) {
        return (a + b);
    }









}
