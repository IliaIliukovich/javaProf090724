package lesson20241029.set;

import lesson20241029.comparator.Book;

import java.util.*;

public class SetExamples {

    public static void main(String[] args) {
        Comparator<String> reversed = Comparator.reverseOrder();
        Set<String> set = new TreeSet<>(reversed);
        set.add("A");
        set.add("B");
        set.add("G");
        set.add("Z");
        set.add("K");
        set.add("Y");
        set.add("A");

        System.out.println(set);
        for (String s : set) {
            System.out.println(s);
        }

        Book book1 = new Book("Rowling", "Harry Potter", 20, true, 15.0);
        Book book2 = new Book("Rowling", "Harry Potter", 10, true, 10.0);
        Book book3 = new Book("Rowling", "Harry Potter", 7, true, 10.0);
        Set<Book> bookSet = new TreeSet<>(new Book.BookComparatorByTitle());
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        for (Book b : bookSet) {
            System.out.println(b);
        }


        Iterator<String> iterator = set.iterator();
        System.out.println(set.contains("B"));

        TreeSet<String> treeSet = (TreeSet<String>) set;
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        SortedSet<String> headedSet = treeSet.headSet("K");
        System.out.println(headedSet);
        SortedSet<String> tailedSet = treeSet.tailSet("G");
        System.out.println(tailedSet);
        SortedSet<String> subSet = treeSet.subSet("Y", "B");
        System.out.println(subSet);
    }


}
