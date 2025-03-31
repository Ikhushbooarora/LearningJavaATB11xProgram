package ex_14_String_Buffer_string_builder;

public class Lab05_string_buffer_functions {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" programming ");
        System.out.println(sb);
        sb.delete(5,16); // delete the substring
        System.out.println(sb);
        sb.replace(5,16,"C++"); // it will replace the programming with c++
        System.out.println(sb);

    }
}
