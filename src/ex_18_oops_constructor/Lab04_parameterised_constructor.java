package ex_18_oops_constructor;

public class Lab04_parameterised_constructor {
    public static void main(String[] args) {
    Car2 c1 = new Car2();
    Car2 c2 = new Car2();

        System.out.println(c1.name);
        System.out.println(c2.name);

    Car2 c3 = new Car2("Tesla", 2015 , "model xxx" );
        System.out.println(c3.name);
        Car2 c4 = new Car2("Mahindra", 2015 , "Scorpio" );
        System.out.println(c4.name);



    }
}
class Car2{
          String name ;
          String model;
          int year;





    //DC
   Car2(){

       name = "unknown car";
       year =1990;
       model = "xxx";
       System.out.println("DC");
   }


   // PC - parameterised constructor
    Car2 (String name_oc_arg , int year_oc_arg , String model_oc_arg){
        this.name = name_oc_arg;
        this.year = year_oc_arg;
        this.model = model_oc_arg; // "this" value will change according to reference
    }

}