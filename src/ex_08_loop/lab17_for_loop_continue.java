package ex_08_loop;

public class lab17_for_loop_continue {
    public static void main(String[] args) {
        for (int i = 0; i < 50 ; i++) {
            if(i==5){
                continue; // skip the i==5 rest will from  from number 0 to 50
            }
            System.out.println(i);

        }

    }
}
