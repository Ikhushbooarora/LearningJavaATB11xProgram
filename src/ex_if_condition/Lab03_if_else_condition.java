package ex_if_condition;

public class Lab03_if_else_condition {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]); // CLI Options
        if (age>18){
            System.out.println("you are allowed to vote ");
        }
        else{
            System.out.println("no you are not allowed to vote");
        }
    }
}
