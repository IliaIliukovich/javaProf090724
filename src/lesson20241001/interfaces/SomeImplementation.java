package lesson20241001.interfaces;

import lesson20240924.inheritance.Cat;

public class SomeImplementation implements SomeInterface {
    @Override
    public void someMethod() {
        System.out.println("Some method implementation");
    }

    @Override
    public String someMethod2(Integer integer, Cat cat) {
        System.out.println("Some method implementation");
        return "String return value";
    }

    public static void main(String[] args) {
        SomeInterface i1 = new SomeImplementation();
        SomeInterface i2 = new SomeImplementation2();
        i1.someMethod();
        i2.someMethod();
        System.out.println(i1.someMethod2(1, null));
        System.out.println(i2.someMethod2(1, null));

        SomeInterface.someStaticMethod();
    }
}
