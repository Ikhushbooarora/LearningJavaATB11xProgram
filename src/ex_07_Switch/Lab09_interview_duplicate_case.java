package ex_07_Switch;

public class Lab09_interview_duplicate_case {
    public static void main(String[] args) {
        int a = 98;
        switch (a){
            case 98:
                System.out.println("98");
           // case 98:
                System.out.println("98"); // duplicate cases are not allowed in switch
        }
    }
}
