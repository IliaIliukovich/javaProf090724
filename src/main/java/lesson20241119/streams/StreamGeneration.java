package lesson20241119.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamGeneration {

    public static void main(String[] args) {
        //        List<Integer> list = List.of(1, 2, 3);

//        Stream<Integer> integerStream2 = list.stream();
//
//        Integer[] array = {1, 2, 3};
//        Stream<Integer> integerStream3 = Arrays.stream(array);



        // stream generation
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Stream created");

        // intermediate operations
        Stream<Integer> streamAfterFilter = integerStream
                .filter(integer -> integer % 2 == 1)
                .peek(integer -> System.out.println("peek() " + integer))
                .limit(3);
        System.out.println("Stream intermediate operations defined");

        // terminal operation
        System.out.println("Terminal operation invocation:");
        List<Integer> resultList = streamAfterFilter.toList();
//        streamAfterFilter.toList(); // IllegalStateException
        System.out.println(resultList);


        List<String> stringList = List.of("A", "B", "C", "D", "cat", "dog", "city");
        List<String> result = stringList.stream().filter(s -> s.length() <= 3).peek(System.out::println).toList();
        result.stream().forEach(System.out::print);
//        result.forEach(System.out::print);
    }



}
