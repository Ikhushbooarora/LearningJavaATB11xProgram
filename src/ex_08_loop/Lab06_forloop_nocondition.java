package ex_08_loop;

public class Lab06_forloop_nocondition {
    public static void main(String[] args) {
        for (int i = 0; ; i++) {
            // ; is compulsory to use otherwise give error in above condition
            System.out.println(i);

            // exit code 0 -> successful execution
            // exit code 130 - >( stop by yourself - kill) red button - interrupted by signal
        }
    }
}
