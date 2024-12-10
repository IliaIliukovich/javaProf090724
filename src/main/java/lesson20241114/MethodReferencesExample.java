package lesson20241114;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MethodReferencesExample {


    public static void main(String[] args) {

        Consumer<String> consumer = string -> System.out.println(string);
        consumer = System.out::println;
        consumer.accept("data");

        consumer = string -> staticMethod(string);
        consumer = MethodReferencesExample::staticMethod;
        consumer.accept("data");

        MethodReferencesExample example = new MethodReferencesExample();
        consumer = example::nonStaticMethod;
        consumer.accept("data");

        BiConsumer<String, String> biConsumer = MethodReferencesExample::staticMethodWithTwoArgs;
        biConsumer.accept("A", "B");

        Supplier<Data> dataSupplier = Data::new;
        dataSupplier = () -> new Data();

        dataSupplier.get();
    }

    static class Data {

    }


    public static void staticMethod(String data) {
        System.out.println("staticMethod with " + data);
    }

    public static void staticMethodWithTwoArgs(String data1, String data2) {
        System.out.println("staticMethod with " + data1 + ", " + data2);
    }

    public void nonStaticMethod(String data) {
        System.out.println("nonStaticMethod with " + data);

        Consumer<String> consumer = this::nonStaticMethod2;
        consumer.accept(data);
    }

    public void nonStaticMethod2(String data) {
        System.out.println("nonStaticMethod2 with " + data);
    }





}
