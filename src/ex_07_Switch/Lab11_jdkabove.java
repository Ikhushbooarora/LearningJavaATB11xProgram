package ex_07_Switch;

public class Lab11_jdkabove {
    public static void main(String[] args) {
        int itemcode = 006;
        switch (itemcode){
            case 001 ,002,003:
                System.out.println("All items are electronic gadget");
                break;
            case 004,005,006:
                System.out.println("this is a mechanical gadget ");
                break;
            default:
                System.out.println("none");
                // this is a new way of separating with commas


        }
    }
}
