package opps_2;

public class oops_polymorphism {
    public static void main(String[] args) {
     Students s1 = new Students();
     s1.name = "khushboo";
     s1.age = 30;
     s1.printInfo(s1.name, s1.age);

    }
}




class  Students{
    String name;
    int age;



    public void printInfo(String name ) {
        System.out.println(name);


    }
        public void printInfo(int age){
            System.out.println(age);
        }


        public void printInfo(String name , int age){
            System.out.println(name +" " + "\n" + age);
        }
}

