package ex_18_oops_constructor;

public class Lab02_example2 {
    public static void main(String[] args) {
    WebAutomation W1 = new WebAutomation();

    }
}
class WebAutomation{
//DC - default constructor or non parameterised constructor

    WebAutomation(){
        System.out.println("I want to read a CSV file");
        System.out.println("open the page before loading the scripts");
        System.out.println("you can do anything which you want to do , before the object created");

    }



}