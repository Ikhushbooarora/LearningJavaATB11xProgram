package ex_04_ternary_operator;

public class Lab07_real_age_classification {
    public static void main(String[] args) {
        //int age = 23
                // (minor = age < 18) , (adult = age > 18) and (senior citizen = age > 65)
        // take an input from user

        String age1 = args[0];
        System.out.println(age1);
        System.out.println(age1 instanceof String);

        int age = Integer.parseInt(age1);
        String result = (age<18) ?"minor" :(age<65)? "Adult" :"senior citizen";
        System.out.println(result);

    }
}
