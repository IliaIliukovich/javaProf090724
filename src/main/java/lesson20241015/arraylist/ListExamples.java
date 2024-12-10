package lesson20241015.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExamples {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // <String>
        List<String> listVersion2 = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println(list);

        List<Integer> integerList = new ArrayList<>(100);
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        for (String s : list) {
            System.out.println("Processing " + s);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Processing " + list.get(i));
        }

        list.set(3, "New value");
        System.out.println(list);

        list.add(0, "Inserted Value");
        System.out.println(list);
//        list.add(200, "new"); // IndexOutOfBoundsException

        List<String> list2 = new ArrayList<>(list);
        List<String> list3 = List.of("A", "B", "C"); // Unmodifiable list
//        list3.add("D"); // impossible

        list2 = new ArrayList<>(List.of("A", "B", "C"));

        System.out.println(list.contains("A"));
        System.out.println(list.contains("G"));

        int index = list.indexOf("C");
        System.out.println(index);
        list.remove(index);
        System.out.println(list);

        ArrayList<String> arrayList = (ArrayList<String>) list;
        arrayList.trimToSize();

        list.remove("Inserted Value");
        System.out.println(list);
        System.out.println(list);

        List objectList = new ArrayList();
        objectList.add("String");
        objectList.add(1);
        objectList.add(1.0);
        objectList.add(true);
        Object object1 = objectList.get(0);
        Object object2 = objectList.get(1);
        Double object3 = (Double) objectList.get(2);
        Boolean object4 = (Boolean) objectList.get(3);
        System.out.println(object4);
        System.out.println(objectList);
    }


}
