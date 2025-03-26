package ex_11_dowhile;

public class Lab02_DIFF_WHILE_DOWHILE {
    public static void main(String[] args) {
        int i=0;
//        while (i<0){
//            System.out.println(i);
//            i++;
//        }
        // no o/ps condition is false
        do{
            System.out.println(i);
            i++;
        }while(i<0);
        // o/p -> 0 will print as it will execute atleast once

    }
}
