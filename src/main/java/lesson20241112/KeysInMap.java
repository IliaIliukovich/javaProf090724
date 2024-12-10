package lesson20241112;

import lesson20241029.comparator.Book;

import java.util.Map;
import java.util.TreeMap;

public class KeysInMap {

    public static void main(String[] args) {
        Book book1 = new Book("Rowling", "Harry Potter. Philosopher's Stone", 20, true, 15.0);
        Book book2 = new Book("Rowling", "Harry Potter. Chamber of Secrets", 10, true, 10.0);
        Book book3 = new Book("Rowling", "Harry Potter. Prisoner of Azkaban", 10, true, 10.0);
        Book book4 = new Book("M. Twain", "Tom Sawyer", 10, true, 10.0);
        Book book5 = new Book("L. Tolstoy", "War and Peace", 10, true, 10.0);

        Map<Book, Integer> bookMap = new TreeMap<>(new Book.BookComparatorByTitle());
        bookMap.put(book1, book1.getCount());
        bookMap.put(book2, book2.getCount());
        bookMap.put(book3, book3.getCount());
        bookMap.put(book4, book4.getCount());
        bookMap.put(book5, book5.getCount());

        for (Map.Entry<Book, Integer> e : bookMap.entrySet()) {
            System.out.println(e);
        }

        book1.setTitle("Java"); // this will break the tree
//        Book updatedBook = book1.updateBook("Java"); // make copy --> modify

        System.out.println("------");
        for (Map.Entry<Book, Integer> e : bookMap.entrySet()) {
            System.out.println(e);
        }

        Integer value = bookMap.get(book3);
        System.out.println(value);


    }


}
