package lesson20241121;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        String data = someMethod();
        data = data == null ? "Default value" : data;
        System.out.println(data.toUpperCase());

        String data2 = someMethod2().orElse("Default value");
        System.out.println(data2.toUpperCase());

        Optional<String> optional = Optional.of("Data");
        System.out.println(optional.get()); // unsave
        System.out.println(optional.orElse("Alternative")); // save
        System.out.println(Optional.of("Data"));

    }

    public static String someMethod() {
        return null;
    }

    public static Optional<String> someMethod2() {
        String data = "Data from method";
//        return Optional.of(data);
        return Optional.empty();
    }


}
