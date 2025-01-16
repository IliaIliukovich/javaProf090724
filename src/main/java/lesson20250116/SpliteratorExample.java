package lesson20250116;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorExample {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Iterator<Integer> iterator = list.iterator();
        Spliterator<Integer> spliterator = list.spliterator();

        while (spliterator.tryAdvance(element -> {
            System.out.println(element);
        }));

//        System.out.println(iterator.next());
//        spliterator.tryAdvance(e -> System.out.println(e));

        spliterator = list.spliterator();
        Spliterator<Integer> spliterator2 = spliterator.trySplit();
        Spliterator<Integer> spliterator3 = spliterator2.trySplit();

        System.out.println("First spliterator");
        while (spliterator.tryAdvance(element -> {
            System.out.println(element);
        }));

        System.out.println("Second spliterator");
        while (spliterator2.tryAdvance(element -> {
            System.out.println(element);
        }));

        System.out.println("Third spliterator");
        while (spliterator3.tryAdvance(element -> {
            System.out.println(element);
        }));


    }

}
