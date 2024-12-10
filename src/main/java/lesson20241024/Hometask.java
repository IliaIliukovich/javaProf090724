package lesson20241024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Hometask {

    public static void main(String[] args) {
        // 2. Имеется заданный список имен студентов:
        //List<String> names = new ArrayList<>(Arrays.asList("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", null, ""));
        //С помощью итератора:
        //a). Вывести имена, состоящие из 4 букв
        //b). Удалить из списка null и пустые строки.

        List<String> names = new ArrayList<>(Arrays.asList("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", null, ""));
        names = new ArrayList<>();
        names.add(null);
        names.add(null);
        names.add("Mary");
        names.add("Jane");
        names.add("Tom");
        names.add("Tim");
        names.add("Mark");
        names.add("Ann");
        names.add(null);
        names.add("");


        // a
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name != null && name.length() == 4) {
                System.out.println(name);
            }
        }


        if (false && true) { // 1 arg calculation
            // do someth
        }

        if (false & true) { // 2 arg calculation
            // do someth
        }

        if (true || false) { // 1 arg calculation
            // do someth
        }

        if (true | false) { // 2 arg calculation
            // do someth
        }

        // b
        Iterator<String> iterator2 = names.iterator();
        while (iterator2.hasNext()) {
            String name = iterator2.next();
            if (name == null || name.isEmpty()) {
                iterator2.remove();
            }
        }

        System.out.println(names);

    }


}
