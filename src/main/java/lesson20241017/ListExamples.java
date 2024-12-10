package lesson20241017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListExamples {

    public static void main(String[] args) {
        Integer[] integerArray = new Integer[10];
        List<Integer> integerList = new ArrayList<>(10);

        int[] intsArray = new int[10];
//        List<int> intsList = new ArrayList<>(10); // impossible

        integerArray[4] = 100;
        integerList.add(100);
        integerList.get(0);

        System.out.println(Arrays.toString(integerArray));
        System.out.println(integerList);
        System.out.println(Arrays.toString(intsArray));


        Arrays.sort(intsArray); // int -- quicksort, Integer -- mergesort
        Collections.sort(integerList); // mergesort

        String[][] arrayOfarray = new String[3][];
        arrayOfarray[0] = new String[1];
        arrayOfarray[1] = new String[3];
        arrayOfarray[2] = new String[2];
        System.out.println(Arrays.deepToString(arrayOfarray));
        System.out.println(arrayOfarray[1][2]);

        List<List<String>> listOfLists = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        listOfLists.add(list1);
        List<String> list2 = new ArrayList<>();
        list2.add("D");
        list2.add("E");
        listOfLists.add(list2);
        List<String> list3 = new ArrayList<>();
        list3.add("F");
        listOfLists.add(list3);
        System.out.println(listOfLists);
        System.out.println(listOfLists.get(1).get(1));

    }


}
