package lesson20241114.lambdavsanonymousclass;

public class UseA {

    public static void main(String[] args) {

        String data = "Data from main()"; // effectively final

        A a1 = new A() { // has it's own scope

            int counter = 0;
            String data = "Data from anonymous class";
            @Override
            public void method() {
//                int counter = 0;
                System.out.println("Method in anonymous class " + counter++ + " " + data);
            }
        };
        a1.method();
        a1.method();
        a1.method();

        A a2 = () -> { // has scope of outer method
            int counter = 0;
//            String data = "Data from lambda class"; // impossible
            System.out.println("Method in lambda " + counter++ + " " + data);
        };
        a2.method();
        a2.method();
        a2.method();

    }


}
