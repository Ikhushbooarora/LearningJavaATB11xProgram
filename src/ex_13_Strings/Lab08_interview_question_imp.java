package ex_13_Strings;

import java.sql.SQLOutput;

public class Lab08_interview_question_imp {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s4 = "Hello"; // String constant pool = 3


        String s2 = new String("Hello");
        String s3 = new String ("Hello");
        String s5 = new String ("hello"); // (object area)) = 3


        System.out.println(s1 == s3); // false
        System.out.println(s1 == s2); // false
        System.out.println(s2 == s3); // false
        System.out.println(s1 == s4); // true
        System.out.println(s3 == s5); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s3.equals(s5)); // false
        System.out.println(s3.equalsIgnoreCase(s5)); // True


        // equalignorecase -> khushboo , Khushboo , KhuShboo , kHUSHboo
        // == check for reference
        // = assignment operator

    }
}
