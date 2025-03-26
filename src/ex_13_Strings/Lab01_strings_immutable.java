package ex_13_Strings;

public class Lab01_strings_immutable {
    public static void main(String[] args) {
        String name ="khushboo";
        name.toUpperCase();
        System.out.println(name); // khushboo
        name = name.toUpperCase();
        System.out.println(name); // KHUSHBOO
        // TWO STRINGS ARE PRESENT IN STRING CONSTANT POOL
    }
}
