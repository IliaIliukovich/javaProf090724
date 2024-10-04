package summary20241004;

public class SomeInterfaceImpl implements SomeInterface {
    @Override
    public void method(String s) {
        System.out.println("SomeInterfaceImpl method");
    }

//    @Override
//    public void defaultMethod(String s){
//        System.out.println("Custom logic for defaultMethod()");
//    }


    public static void main(String[] args) {
        SomeInterface s = new SomeInterfaceImpl();
        s.method("input string");
        s.defaultMethod("input string");

        staticMethod(s);
    }

    public static void staticMethod(SomeInterface s) {
        s.method("input");
    }
}
