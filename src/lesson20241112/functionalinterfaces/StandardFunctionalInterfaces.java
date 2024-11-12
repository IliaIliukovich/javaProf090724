package lesson20241112.functionalinterfaces;


import java.util.Random;
import java.util.function.*;

public class StandardFunctionalInterfaces {

    // void -> void
    // data -> void ---- Consumer ---- accept()
    // void -> data ---- Supplier ---- get()
    // data1 -> data2 ---- Function - UnaryOperator ---- apply()
    // (data1, data2) -> data3 ---- BiFunction - BinaryOperator ---- apply()
    // data -> boolean ----- Predicate ---- test()

    public static void main(String[] args) {
        Consumer<Integer> printData = integer -> System.out.println(integer);
        printData.accept(777);

        Supplier<String> generateString = () -> new Random().nextInt(10) + " data";
        System.out.println(generateString.get());
        System.out.println(generateString.get());
        System.out.println(generateString.get());

        Function<Integer, Double> by10 = integer -> (double) integer / 10;
        System.out.println(by10.apply(5));
        System.out.println(by10.apply(6));
        System.out.println(by10.apply(7));

        UnaryOperator<Integer> multiplyBy2 = integer -> integer * 2;
        System.out.println(multiplyBy2.apply(2));
        System.out.println(multiplyBy2.apply(5));
        System.out.println(multiplyBy2.apply(7));

        Predicate<String> isLongEnough = s -> s.length() > 5;
        System.out.println(isLongEnough.test("Hello!!!"));
        System.out.println(isLongEnough.test("Hello"));

    }


}
