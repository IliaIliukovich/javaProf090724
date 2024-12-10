package summary20241004;

public interface SomeInterface {

    void method(String s);

    default void defaultMethod(String s) {
        // some code
        System.out.println("Default realisation of defaultMethod");
        privateMethod();
    }

    private void privateMethod() {
        // some code
        System.out.println("privateMethod()");
    }


}
