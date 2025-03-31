package ex_14_String_Buffer_string_builder;

public class Lab03_String_builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb); // append is similar to concat

        System.out.println(sb.reverse());
    }
}
