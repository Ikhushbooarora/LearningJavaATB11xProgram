package ex_07_Switch;

import java.util.Scanner;

public class Lab04_real_switch_Automation {
    public static void main(String[] args) {
        /* web automation
         I will ask the user to give me the input from browser which he  wants to use to.
        I will start the automation in that browser */


       // String browser = args[0];
      //  System.out.println(browser);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser name ");
        String browser = scanner.next();
// selenium doesn't support opera

        switch (browser){

            case "chrome" :
                System.out.println("starting the chrome");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("starting the firefox browser");
                System.out.println();
                System.out.println();
                break;
            case"edge":
                System.out.println("starting the edge browser");
                break;









        }




    }
}

