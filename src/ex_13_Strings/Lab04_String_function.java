package ex_13_Strings;

import java.util.Locale;

public class Lab04_String_function {
    public static void main(String[] args) {
        char c  ='A';
        System.out.println(c);

        String s1 ="A";
        System.out.println(s1.length());
        String s2 ="AbcD";
        System.out.println(s2.length());
        System.out.println(s2.toLowerCase(Locale.ROOT));
        System.out.println(s2.toUpperCase(Locale.ROOT));
        System.out.println(s2.concat("efg"));
    }
}
