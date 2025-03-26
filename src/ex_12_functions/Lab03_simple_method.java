package ex_12_functions;

public class Lab03_simple_method {
    public static void main(String[] args) {
 khushboo_f1();
int result =  return_int();
        System.out.println(result);
 String r = return_String();
        System.out.println(r);
 boolean r1 =return_boolean();
        System.out.println(r1);
 float r2 = return_float();
        System.out.println(r2);
    }
   // static returnDatatype(void , any other datatype)
        //void -> no return[
    static void khushboo_f1(){
        System.out.println( "no return");
    }
    static int return_int() {
        return 10;
    }
        static String return_String(){
            return "khushboo" ;
        }

static boolean return_boolean (){
        return true;
}
static float return_float(){
    return 10.5f;
    }

}
