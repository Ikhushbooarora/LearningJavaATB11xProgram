package ex_03_typecasting.java;

public class Lab03_Typecasting_narrowing {
    public static void main(String[] args){
        int val = 200 ;
        // byte b = val;  Invalid ,in this data loss will be occur so implicit casting is not allowed in narrowing
        byte b2 = (byte)val; // valid - narrowing explicit casting but data loss will occur
        System.out.println(b2);

        int val1 = 300;
        byte b1 = (byte)val1;
        System.out.println(b1);
    }
}
