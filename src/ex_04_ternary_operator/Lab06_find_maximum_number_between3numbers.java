package ex_04_ternary_operator;

public class Lab06_find_maximum_number_between3numbers {
    public static void main(String[] args) {
        int n1= 2;
        int n2 = 9;
        int n3 = -11;

        //Logic building formula
        //step 1 : find inputs/outputs
        //I/O -> n1,n2,n3- int
        // O/P -> String -> max number

        //step 2 rough logic , think about it.
        //n1 > n2 and n1 > n3 -> n1
        //n2 > n1 and n2 > n3 -> n2
        //n3


        int max = (n1 > n2 ) ? (n1 > n3) ? n1:n3 :((n2>n3)? n2 :n3);
        System.out.println("max is :"+ max);








        System.out.println();
    }
}
