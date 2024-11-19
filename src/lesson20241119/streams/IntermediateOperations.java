package lesson20241119.streams;

import lesson20241001.Cat;

import java.util.Comparator;
import java.util.List;

public class IntermediateOperations {

    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        List<String> stringList = List.of("One", "Two", "Three", "Four", "One", "Five");

        List<Integer> result = integerList.stream().filter(i -> i % 2 == 0).filter(i -> i <= 6).toList();
        System.out.println(result);

        result = integerList.stream().sorted(Comparator.reverseOrder()).skip(1).limit(3).toList();
        System.out.println(result);

        List<String> stringResult = stringList.stream().peek(System.out::println).distinct().peek(System.out::println).toList();
        System.out.println(stringResult);

        List<Cat> catList = stringList.stream().map(s -> new Cat(s, 1)).toList();
        System.out.println(catList);

        List<Character> uniniqueFirstLetters = stringList.stream().map(s -> s.toCharArray()[0]).distinct().toList();
        System.out.println(uniniqueFirstLetters);

    }


}
