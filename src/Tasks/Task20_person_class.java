package Tasks;

public class Task20_person_class {
    public static void main(String[] args) {
        person p1 = new person();
         p1.talking();
         p1.full_name();
         p1.persondetails("khushboo", 30, 100);
         p1.sum(2,4);


    }
}
class person {
    String name;
    byte age;
    String salary;
    String email_address;
    boolean ismarried;
    String mobile_no;
    String hobbies;
    int rollno;

    //1.without parameter and  without return
    void talking() {
        System.out.println("she is very talkative");
    }

    // 2. without parameter and with return type
    String full_name(){
        name = "khushboo";
        System.out.println("my name is:"+name);
        return name;

    }

    // 3. with parameters and without return type
    void persondetails(String name , int age , double salary){
        System.out.println("my name is :"+ name + "\nmy age is :" + age +"\nmy salary is :"+ salary );
    }

    //4. with parameter and with return type
     int sum(int a , int b){
        int sum = a+b;
        return sum;
     }


}