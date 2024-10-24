package lesson202410124;

import java.util.*;

public class LoopsExample {

    public static void main(String[] args) {
        List<String> data = List.of("A", "B", "C", "D", "E", "F");
        List<String> list1 = new ArrayList<>(data);
        List<String> list2 = new LinkedList<>(data);

        for (int i = 0; i < list1.size(); i++) { // n
            System.out.println(list1.get(i));
        }

        for (int i = 0; i < list2.size(); i++) { // n^2 not effective
            System.out.println(list2.get(i));
        }

        for (String s : list1) { // n
            System.out.println(s);
        }

        for (String s : list2) { // n effective
            System.out.println(s);
        }

        ListIterator<String> iterator = list2.listIterator(); // n effective
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }


}
