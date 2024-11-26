package lesson20241126;

import java.util.List;

public class StatefulOperations {

    public static void main(String[] args) {

        List<Integer> integers = List.of(1, 3, 2, 4, 5, 1, 0, 0);
        List<Integer> integerList = integers.stream() // O(n log n)
                .peek( e -> System.out.println("Initial stream: " + e))
                .distinct() // O(n)
                .peek( e -> System.out.println("After distinct: " + e))
                .sorted() // O(n log n)
                .peek( e -> System.out.println("After sorted: " + e))
                .toList();
        System.out.println(integerList);

        integerList = integers.stream() // O(n log n)
                .peek( e -> System.out.println("Initial stream: " + e))
                .sorted()
                .peek( e -> System.out.println("After sorted stream: " + e))
                .distinct()
                .peek( e -> System.out.println("After distinct stream: " + e))
                .toList();
        System.out.println(integerList);

    }



}
