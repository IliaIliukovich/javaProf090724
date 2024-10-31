package lesson20241031;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Hometask {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(List.of(1, 4, 3, 2, 1, 2, 2, 0));
        Integer key = 2;
        List<Integer> firstAndLast = findFirstAndLast(list, key);
        System.out.println(firstAndLast);
    }

    private static List<Integer> findFirstAndLast(LinkedList<Integer> list, Integer key) {
        List<Integer> result = new ArrayList<>();

        int index = 0;
        for (Integer element : list) {
            if (element.equals(key)) {
                result.add(index);
                break;
            }
            index++;
        }

        if (result.isEmpty()) {
            return result;
        }

        index = list.size() - 1;
        Iterator<Integer> descendingIterator = list.descendingIterator();
        while (descendingIterator.hasNext()){
            Integer element = descendingIterator.next();
            if (element.equals(key)) {
                result.add(index);
                break;
            }
            index--;
        }
        return result;
    }


}
