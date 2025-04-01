package ex_18_oops_constructor;

public class Lab01_oops_constructor {
    public static void main(String[] args) {

        Baby b1 = new Baby();
        new Baby();
        Baby b2; // in this object is not created so only two times will print for first line and the second object created in second line


    }




}
class Baby{
    //Attribute / instance variable / data members

    String name;


    //behaviour
    void cry(){
        System.out.println("cry");
    }

    void sleep(){
        System.out.println("sleep!!");
    }


    void eat(){
        System.out.println("eat");
    }


    // default constructor
    Baby(){
        System.out.println("I am called as a default constructor");
        // fetch data from mysql database
        // read from csv file, XLSX
        // OPEN A FILE AND READ THE data (json , test data ,xlsx,txt file)



    }

}