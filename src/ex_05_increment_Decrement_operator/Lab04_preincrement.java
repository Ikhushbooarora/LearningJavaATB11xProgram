package ex_05_increment_Decrement_operator;

public class Lab04_preincrement {
    public static void main(String[] args) {
     int a = 10;
     int result = ++a;
        System.out.println(result);
        System.out.println(a);

        // 5 | 10 | na
        // 6 | 11 | 11
        // 7 |na | 11
        // 8 |11 | na
        int  b = 11;
        int c = b++;
        System.out.println(b);
        System.out.println(c);


        // 14 | 11 | na
        // 15 | 12 | 11
        // 16 | 12 | na
        // 17 | na | 11
    }
}
