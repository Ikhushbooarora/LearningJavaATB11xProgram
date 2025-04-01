package ex_18_oops_constructor;

public class Lab06_PC_example2 {
    public static void main(String[] args) {
    Person p1 = new Person("khushboo", 123456789 , "abc" );
    Person p2 = new Person("Gaurav" , 987654322, "xyz");

    Person p3= new Person();
    p3.name = "Arora";
        System.out.println(p3.name); // in this object is already created but in above cases p1 and p2 we are initialising the values during the object creation

    p1.eat();
    p2.eat();
    p3.eat();
    }
}

class Person{
    String name;
    long phone;
    String address;


    Person(){

    }

      Person(String name_arg, long phone_arg, String address_arg){
        this.name = name_arg;
        this.phone = phone_arg;
        this.address = address_arg;
    }
    void eat(){
        System.out.println(this.name + " is eating");
      }
}