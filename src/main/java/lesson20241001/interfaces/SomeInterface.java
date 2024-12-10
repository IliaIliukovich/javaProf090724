package lesson20241001.interfaces;

import lesson20240924.inheritance.Cat;

public interface SomeInterface {

    String data = "DATA"; // public static final

    void someMethod(); // abstract public

    String someMethod2(Integer integer, Cat cat); // abstract public

    static void someStaticMethod() { // public
        System.out.println("someStaticMethod");
    }

}
