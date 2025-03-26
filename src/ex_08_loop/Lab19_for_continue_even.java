package ex_08_loop;

public class Lab19_for_continue_even {
    public static void main(String[] args) {
       // for (int i = 0; i < 50; i++) {
//            if(i%2==0){
//                System.out.println("number is even -> "+i);
//                continue;
//            }
            for (int j = 0; j<50 ; j++) {
                if(j%2==0){
                continue; // meaning of continue is what part we have to skip
            }
        System.out.println("number is odd -> "+j);

        }
    }
}
