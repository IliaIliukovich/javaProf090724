package lesson20241017.customiterator;

import java.util.Iterator;

public class UseMyArrayList {

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(new String[] {"A", "B", "C", "D", "E"});

        for (String s : myArrayList) {
            String element = s;
            System.out.println(element);


        }

        // revereIterator E --> D --> C --> B --> A
        Iterator<String> reversed = myArrayList.reverseIterator();
        while (reversed.hasNext()){
            System.out.println(reversed.next());
        }



//        Iterator<String> iterator = myArrayList.iterator();
//        System.out.println(iterator.next());

//        myArrayList = new MyArrayList(new String[0]);
//        for (String s : myArrayList) {
//            String element = s;
//            System.out.println(element);
//        }
//
//        myArrayList = new MyArrayList(new String[] {"A"});
//        for (String s : myArrayList) {
//            String element = s;
//            System.out.println(element);
//        }
//
//        Iterator<String> iterator = myArrayList.iterator();
//        iterator.next();
////        iterator.next(); // impossible

    }


}
