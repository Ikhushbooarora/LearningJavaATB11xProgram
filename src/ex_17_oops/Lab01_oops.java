package ex_17_oops;


public class Lab01_oops {
    public static void main(String[] args) {

        person gaurav;
        person p2 = new person();
        // person = class
        // p2 = obj reference
        // new person() = object
        p2.name= "khushboo";
        System.out.println(p2.name);



        person p3 = new person();
        p3.name= "Arora";
        System.out.println(p3.name);


        new person(); // object without any refrenece
    }
}
class person{
    // Attribute / properties / data members / instance variables
String name;
String phone;
String color_eyes;
int legs;
double Salary;
byte age ;
double weight;
boolean ismale;

    // Behaviour / function / method

    void sleep(){
        System.out.println("I am sleeping");
    }
    String greet(String name){
     return "Hello"+name;
    }
    void talk (){
        System.out.println("talking");
    }
   int remaining_amount_sal(int salary , int tax){
        return (salary-tax);
    } // it will not give any take memory from class person till here it is just a blueprint

}