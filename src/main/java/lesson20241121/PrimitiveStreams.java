package lesson20241121;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreams {

    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 5, 7);
        intStream = IntStream.rangeClosed(1, 100);
        System.out.println(intStream.sum());

        int result = IntStream.rangeClosed(1, 100).filter(value -> value == 2).findAny().orElse(-1);
        System.out.println(result);

        Stream<Integer> stream = IntStream.rangeClosed(1, 10).boxed(); // IntStream -> Stream
        IntStream intStream1 = stream.mapToInt(value -> value); // Stream -> IntStream
        Stream<String> stringStream = IntStream.rangeClosed(1, 10).mapToObj(value -> "result: " + value);// IntStream -> Stream
        stringStream.forEach(System.out::println);


        Integer[] data = new Integer[10];

        for (int i = 0; i < 10; i++) {
            data[i] = i;
        }
        System.out.println(Arrays.toString(data));

        IntStream.range(0, 10).forEach(i -> data[i] = i);
        System.out.println(Arrays.toString(data));

        List<String> list = List.of("A", "B", "C", "D", "E", "F");
        list.forEach(s -> System.out.println(s));
        IntStream.range(0, list.size()).forEach(i -> System.out.println(list.get(i)));

        int[][] ints = new int[4][5];
//        for (int i = 0; i < ints.length; i++) {
//            for (int j = 0; j < ints[i].length; j++) {
//                ints[i][j] = 7;
//            }
//        }
        IntStream.range(0, ints.length).forEach(i ->
                IntStream.range(0, ints[i].length).forEach(j -> System.out.println("(i = " + i + ", j =" + j + ")")));
        IntStream.range(0, ints.length).forEach(i ->
                IntStream.range(0, ints[i].length).forEach(j -> ints[i][j] = 7));

        Arrays.stream(ints).forEach(array -> System.out.println(Arrays.toString(array)));


    }



}
