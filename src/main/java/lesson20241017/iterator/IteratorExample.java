package lesson20241017.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("AAA");
        list.add("Three");
        list.add("Four");
        list.add("AAA");
        list.add("Five");
        list.add("AAA");

        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);
            System.out.println(element);
        }

        for (String s : list) { // for-each loop depends on iterator
            String element = s;
            System.out.println(element);
        }

        Iterator<String> iterator = list.iterator();
        boolean hasNext = iterator.hasNext();
        String nextElement = iterator.next();
        System.out.println(hasNext);
        System.out.println(nextElement);
        nextElement = iterator.next();
        System.out.println(nextElement);
        nextElement = iterator.next();
        System.out.println(nextElement);
        nextElement = iterator.next();
        System.out.println(nextElement);
        nextElement = iterator.next();
        System.out.println(nextElement);

        if (iterator.hasNext()) {
            nextElement = iterator.next();
            System.out.println(nextElement);
        }

        Iterator<String> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            String element = iterator2.next();
            System.out.println(element);
        }

        Iterator<String> iterator3 = list.iterator();
        while (iterator3.hasNext()) {
            String element = iterator3.next();
            if (element.equals("AAA")) {
                iterator3.remove();
            }
        }
        System.out.println(list);

        Iterator<String> iterator4 = list.iterator();
        iterator4.next();
        iterator4.next();
        iterator4.remove();
        System.out.println(list);
    }


}
