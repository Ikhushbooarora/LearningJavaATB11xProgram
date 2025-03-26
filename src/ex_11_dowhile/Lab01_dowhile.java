package ex_11_dowhile;

public class Lab01_dowhile {
    public static void main(String[] args) {
        int a=1;
        do{
            System.out.println("This is a body , which will be executed at least once");
            System.out.println(a);
            a++;
        }while(a<10);

    }
}
