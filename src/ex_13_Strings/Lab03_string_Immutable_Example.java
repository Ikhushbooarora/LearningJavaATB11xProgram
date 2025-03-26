package ex_13_Strings;

public class Lab03_string_Immutable_Example {
    public static void main(String[] args) {
        String s1 = "Hello";
        s1 = s1.concat(" World");
        System.out.println(s1);
    }
}
