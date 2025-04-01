package opps_2;

class Pen{
    String color;
    String type; // ballpoint pen  or gel

    public void write() {
        System.out.println("writing something");
    }

    public void printcolor(){
        System.out.println(this.color); // this is a keyword
    }

}
class Student{
    String name;
    int age;



    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }


//    Student(){
//        System.out.println("constructor called"); // non-parametrised constructor
//    }

    Student(String name , int age){ // parameterised constructor
        this.name = name;
        this.age = age;

    }
    Student(Student s2){
        this.name =s2.name;
        this.age = s2.age;


    }
   Student(){

   }


}



    public class practice_oops {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color ="blue";
        p1.type = "ballpoint";

        Pen p2 = new Pen(); // new = keyword , student() = object /constructor / functions
        p2.color = "black";
        p2.type = "gel";

        p1.write();
        p1.printcolor();
        p2.printcolor();


       // Student s1 = new Student("khushboo", 30);


        //s1.printinfo();

Student s1 = new Student();
        s1.name ="gaurav";
        s1.age=30;


        Student s2 = new Student(s1);
        s2.printinfo();


    }
}
