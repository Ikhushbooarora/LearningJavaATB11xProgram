package ex_14_String_Buffer_string_builder;

public class Lab01_String_bufferandString_Builder {
    public static void main(String[] args) {

        String s0 = "khushboo"; //string constant pool
        String s1 = new String("khushboo"); // located in object area

        StringBuffer stringBuffer = new StringBuffer("khushboo"); // located in object area
        StringBuilder sb = new StringBuilder("Khushboo"); // located in object area

        System.out.println(sb);
        System.out.println(s0);
        System.out.println(stringBuffer );
        System.out.println(sb);
        // in total there are total 4 strings

    }
}
