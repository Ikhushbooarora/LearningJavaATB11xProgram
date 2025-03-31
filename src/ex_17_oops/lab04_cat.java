package ex_17_oops;

import org.w3c.dom.ls.LSOutput;

public class lab04_cat {
    public static void main(String[] args) {
        cat c1 = new cat();// only 1 object is there new cat
        cat c2; // 1 object and 2 ref
        new cat(); // 2 object and 2 ref

        c1.running();
        // c2.running();this is not possible because there is no object

        new cat().running();
        System.out.println(new cat().name);
    }

}
class cat {
    String name; // default value of this one is null
    void running(){
        System.out.println("running");
    }

}