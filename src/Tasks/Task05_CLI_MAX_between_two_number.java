package Tasks;

public class Task05_CLI_MAX_between_two_number {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        String num= (num1>num2)? "num1 is greater":"num2 is greater";
        System.out.println(num);
        /* o/p num 1 = 4
        num 2 = 2
        num 1 is greater
        num 1 = 2
        num 2 = 4
        num 2 is greater
         */


    }


       }

