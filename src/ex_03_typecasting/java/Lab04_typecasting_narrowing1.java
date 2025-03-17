package ex_03_typecasting.java;

public class Lab04_typecasting_narrowing1 {
    public static void main(String[] args){
        long phone_number = 9876543210l;
//                short s = phone_number;
        short s = (short)phone_number;
        System.out.println(s);

    }
}
