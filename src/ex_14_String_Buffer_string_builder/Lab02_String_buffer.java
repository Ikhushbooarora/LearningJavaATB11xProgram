package ex_14_String_Buffer_string_builder;

public class Lab02_String_buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append("world");
        System.out.println(sb); // In this only 1 string is there helloworld
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.reverse());

        String s1 = "khushboo";
        String s2 ="Arora";
        String s3 = s1+s2;
        System.out.println(s3); // in this there are total 3 strings

    }
}
