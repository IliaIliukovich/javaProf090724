package lesson20241017.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("is");
        list.add("the");
        list.add("best");
        list.add("programming");
        list.add("language");

        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        ListIterator<String> listIterator2 = list.listIterator();
        listIterator2.next();
        listIterator2.next();
        listIterator2.next();
        listIterator2.next();
        System.out.println(listIterator2.previous());
        listIterator2.remove();
        listIterator2.add("worst");
        listIterator2.previous();
        listIterator2.add("not");
        listIterator2.add("the");

        System.out.println(list);

    }


}
