package summary20241025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class CompareExamples {

    public static void main(String[] args) {


        System.out.println("string1".equals("string1"));
        System.out.println(Objects.equals("string1", "string1"));
        int a = 10;
        int b = 11;

        System.out.println(a <= b);

        Integer i1 = 10;
        Integer i2 = 20;
        System.out.println(i1 < i2); // unboxing
        System.out.println(i1.compareTo(i2));
        System.out.println(i2.compareTo(i1));
        System.out.println(i1.compareTo(i1));

        char c1 = 'a';
        char c2 = 'b';
        char c3 = 'A';

        System.out.println(c1 < c2);
        System.out.println(c3 < c1);
        Character c4 = 'a';
        Character c5 = 'A';
        System.out.println(c4.compareTo(c5)); // 32 ---> c4 is more than c5


        boolean b1 = true;
        boolean b2 = false;
//        System.out.println(b1 < b2); // impossible
        Boolean b3 = true;
        Boolean b4 = false;
        System.out.println(b3.compareTo(b4));


        System.out.println("st1".compareTo("str2")); // -65 ---> str1 is less than str2
        System.out.println(((Integer) "st1".length()).compareTo(((Integer) "str2".length()))); // string length comparition

        System.out.println("abc".compareTo("abd")); // -1
        System.out.println("abc".compareTo("abcd")); // -1
        System.out.println("abcz".compareTo("abcd")); // 22
        System.out.println("Cat".compareTo("cat")); // -32
        System.out.println("Cat".toLowerCase().compareTo("cat".toLowerCase())); // 0

        List<String> list = new ArrayList<>(List.of("hello", "world", "hi", "bye", "123", "Hello"));
        Collections.sort(list);
        System.out.println(list);

    }



}
