package summary20241115;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class CompositionExamples {

    public static void main(String[] args) {
        Consumer<Integer> consumer = System.out::println;
        Consumer<Integer> consumer2 = System.err::println;
        Consumer<Integer> consumer3 = consumer.andThen(consumer2);
//        Consumer<Integer> consumer3 = integer -> {
//            System.out.println(integer);
//            System.err.println(integer);
//        };

        consumer3.accept(1);
        consumer3.accept(2);
        consumer3.accept(3);

        Predicate<String> isLong = s -> s.length() > 5;
        Predicate<String> startsWithS = s -> s.startsWith("s");

        System.out.println(isLong.test("Hello!"));
        System.out.println(isLong.negate().test("Hello!"));
        Predicate<String> compositePredicate = isLong.and(startsWithS);
        System.out.println(compositePredicate.test("s Hello world!"));

        Function<String, String> function1 = String::toUpperCase;
        Function<String, String> function2 = s -> s.substring(0, 3);
        Function<String, String> function3 = s -> "-" + s + "-";

        System.out.println(function1.andThen(function2).andThen(function3).apply("input"));
        System.out.println(function1.compose(function2).compose(function3).apply("input"));
    }


}
