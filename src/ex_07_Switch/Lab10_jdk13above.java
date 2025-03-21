package ex_07_Switch;

public class Lab10_jdk13above {
    public static void main(String[] args) {
        // in jdk>13
        int itemcode = 001;
        switch (itemcode){
            case 001-> System.out.println("001");
            case 002 -> System.out.println("002");
            default -> System.out.println("default");// with arrow -> no break statement is require .
            // this is a new method
        }
    }
}
