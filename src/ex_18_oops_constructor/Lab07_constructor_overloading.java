package ex_18_oops_constructor;

public class Lab07_constructor_overloading {
    public static void main(String[] args) {

        Person1 p1 = new Person1("khushboo", 123456789 , "abc" );
        Person1 p2 = new Person1("Gaurav" , 987654322, "xyz");

        Person1 p3= new Person1();
        p3.name = "Arora";
        System.out.println(p3.name); // in this object is already created but in above cases p1 and p2 we are initialising the values during the object creation

        Person1 p4= new Person1("Wadhwa", 12987623);
        System.out.println(p4.address);

        p1.talk();
        p2.talk();
        p3.talk();
        p4.talk();
    }
}

class Person1{
    String name;
    long phone;
    String address;


    Person1(){

    }

    Person1(String name_arg, long phone_arg, String address_arg) {
        this.name = name_arg;
        this.phone = phone_arg;
        this.address = address_arg;

    }
        Person1(String name_arg, long phone_arg){
            this.name = name_arg;
            this.phone = phone_arg;

        }
        void talk(){
            System.out.println(this.name + " is talking");
        }
    }