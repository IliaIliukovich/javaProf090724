package lesson20241017.customiterator;

import java.util.Iterator;

public class UseRandomIterator {

    public static void main(String[] args) {
        Iterable<String> cards = new MyArrayList(new String[] {"6", "7", "8", "9", "10", "Joker"});
        for (String c : cards) {
            System.out.println(c);
        }

        System.out.println("Random order1:");
        MyArrayList cardsLink = (MyArrayList) cards;
        Iterator<String> iterator = cardsLink.randomIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Random order2:");
        iterator = cardsLink.randomIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }


}
