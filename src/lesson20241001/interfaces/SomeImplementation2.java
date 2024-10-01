package lesson20241001.interfaces;

import lesson20240924.inheritance.Cat;

public class SomeImplementation2 implements SomeInterface {
    @Override
    public void someMethod() {
        System.out.println("Some method implementation, ver 2");
    }

    @Override
    public String someMethod2(Integer integer, Cat cat) {
        System.out.println("Some method implementation, ver 2");
        return "String return value 2";
    }
}
