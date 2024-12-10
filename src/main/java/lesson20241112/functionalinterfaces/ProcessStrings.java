package lesson20241112.functionalinterfaces;

import java.util.function.BinaryOperator;

public class ProcessStrings {

    public static void main(String[] args) {

        StringProcessor toUpperCase = s -> s.toUpperCase();

        String result = toUpperCase.process("Input");
        System.out.println(result);

        StringProcessor limit = s -> {
            String output = s.substring(0, 5);
            return output;
        };
        result = limit.process("Hello world!!!");
        System.out.println(result);

        StringProcessor addDots = s -> "..." + s + "...";
        result = addDots.process("Data");
        System.out.println(result);

        TwoStringProcessor concat = (s1, s2) -> s1 + "|" + s2;
        result = concat.process("One", "Two");
        System.out.println(result);

        BinaryOperator<String> concatOperator = (s1, s2) -> s1 + "|" + s2;
        result = concatOperator.apply("A", "B");
        System.out.println(result);

        result = ((BinaryOperator<String>)((s1, s2) -> s1 + "|" + s2)).apply("C", "D");
        System.out.println(result);

    }

    @FunctionalInterface
    interface TwoStringProcessor {

        String process(String first, String second);

    }


}
