package lesson20241024;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExamples {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

//        list.remove(2);
//        list.remove("Five");

        System.out.println(list.get(2));
        System.out.println(list);

        LinkedList<String> list2 = new LinkedList<>(list);
        list2.addFirst("First element");
        list2.addLast("Last element");

        System.out.println(list2);

        // O(n)
        for (String s : list2) {
            System.out.println(s);
        }

        // O(n)
        Iterator<String> iterator = list2.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

        // O(n^2)
        for (int i = 0; i < list2.size(); i++) { // n
            String data = list2.get(i); // n
        }

    }



}
