package ex_03_typecasting.java;

public class Lab05_typecasting_narrowing {
    public static void main(String[] args) {
        int course = 100;
        float gst = 18.45f;
        //int total = course +gst; // Narrow implicit in this data loss will occur
        int total1 =course+(int)gst;
        System.out.println(total1);

        float total2 =course+gst; // widening auto implicit
        System.out.println(total2); // widening auto explicit

        float total3 =(float)course+gst;
        System.out.println(total3);


    }
}
