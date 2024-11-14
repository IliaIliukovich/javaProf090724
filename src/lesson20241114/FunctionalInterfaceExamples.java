package lesson20241114;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionalInterfaceExamples {

    public static void main(String[] args) {
        // void -> void

        Supplier<String> supplier = () -> {
            process();
            return null;
        };
        supplier.get();

        Consumer<String> consumer = data -> process();
        consumer.accept(null);
        consumer.accept("angdngadgn");
        consumer.accept("angdngadgn");
        consumer.accept("angdngadgn");

        List<String> list = List.of("A", "B", "C", "D", "E");
        String delimeter = "|";
        list.forEach(element -> System.out.print(element + delimeter));

    }

    public static void process() {
        System.out.println("Hello world!");
    }


}
