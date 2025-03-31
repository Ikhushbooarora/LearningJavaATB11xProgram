package ex_17_oops;

public class person2 {
    public static void main(String[] args) {
        System.out.println("bye");
    }

}
class p1{}
class p2{}
 // class 123{} not possible due to not start with integer
class $123{}
class _123{}
 //class a b{} not possible due to space between a and b
class p3{}
// class p3 {} // duplicate class is not possible

// class p4 , class p5 {} separated by comma is not possible
class p4{};
class p5{
    class p6{
        class p7{
            class p8{

            }
        }
    }

}
class p8 {
    public static void main(String[] args) {
        System.out.println("hi");
    }
}

class p9 {
    public static void main(String[] args) {
        System.out.println("p9");
    }
}




// after jdk 13 it is possible to call multiple classes one by one