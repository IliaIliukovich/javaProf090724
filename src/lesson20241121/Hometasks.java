package lesson20241121;

import java.util.Comparator;
import java.util.List;

public class Hometasks {

    public static void main(String[] args) {
        List<String> list = List.of("A", "B", "A", "D", "B");
        List<String> stringList = list.stream().distinct().toList();
        System.out.println(stringList.size());
        System.out.println(list.stream().distinct().count());

        List<String> names = List.of("Tom", "Jane", "Martin", "Peter", "Mary", "Edd");
        names.stream().sorted().limit(3).forEach(System.out::println);
        names.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).forEach(System.out::println);
    }


}
