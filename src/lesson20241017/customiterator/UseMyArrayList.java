package lesson20241017.customiterator;

import java.util.Iterator;

public class UseMyArrayList {

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(new String[] {"A", "B", "C", "D", "E"});

        for (String s : myArrayList) { // E --> D --> C --> B --> A
            String element = s;
            System.out.println(element);
        }

//        Iterator<String> iterator = myArrayList.iterator();
//        System.out.println(iterator.next());


    }


}
