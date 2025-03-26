package ex_13_Strings;

public class Lab10_String_Functions {
    public static void main(String[] args) {
        String name = "sonal";
        System.out.println(name.length()); // 5
        System.out.println(name.charAt(3)); // a "it works on indices "
      //  System.out.println(name.charAt(10)); //  Index 10 out of bounds for length


        // 2.concat

        System.out.println(name.concat(" Kumar")); // sonal kumar

        // 3. contains
        System.out.println(name.contains("a")); // true

        // 4.equals
        System.out.println(name.equals("sonal")); //

        // 5. equalsIgnoreCase
        System.out.println(name.equalsIgnoreCase("Sonal"));


        // 6. indexOf
        System.out.println(name.indexOf('l'));

      String s1 = "madam";
      //Returns the index within this string of the first occurrence of the specified substring.
        System.out.println(s1.indexOf("a"));



        // 7.length
        System.out.println(name.length());

        // 8.replace
        System.out.println(name.replace('s', 'm'));

        //9.split


        String name4 = "khushboo@happy.com@1234";
       String[] split =name4.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        //10.substring
        System.out.println(name.substring(0,3));

        //11.tolowercase
        System.out.println(name.toLowerCase());

        //12.touppercase
        System.out.println(name.toUpperCase());

        //13startswith
        System.out.println(name.startsWith("s"));

        //14. endswith
        System.out.println(name.endsWith("m"));

        //15.trim
        String name3 = "   sonal Harish   ";
        System.out.println(name3.trim());

        //16.compareto
        System.out.println(name.compareTo("sonal"));   // compare  function gives te result in o or 1.


        String anotherpalindrome ="Niagara. O roar again!";
        String roar =anotherpalindrome.substring(11,15);
        System.out.println(roar);



        String s11 = "Khushboo";
        String s21 =s11.concat(" Arora");
        System.out.println(s21);

        //concatenation by (+)

        String s111 ="Hello";
        String s222 ="World";
        String s333 ="ji";
        String result = s111 +s333+s222;
        System.out.println(result);
        String result1 = s111+s222+s222;
        System.out.println(result1);



        String n ="khushbooarora";
        System.out.println(n.indexOf("h"));   // coming first from starting
        System.out.println(n.lastIndexOf('o')); // coming in last
        System.out.println(n.indexOf("m"));



    }
}
