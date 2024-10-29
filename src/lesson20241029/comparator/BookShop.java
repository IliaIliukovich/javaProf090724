package lesson20241029.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookShop {

    public static void main(String[] args) {
        Book book1 = new Book("Rowling", "Harry Potter. Philosopher's Stone", 20, true, 15.0);
        Book book2 = new Book("Rowling", "Harry Potter. Chamber of Secrets", 10, true, 10.0);
        Book book3 = new Book("Rowling", "Harry Potter. Prisoner of Azkaban", 10, true, 10.0);
        Book book4 = new Book("M. Twain", "Tom Sawyer", 10, true, 10.0);
        Book book5 = new Book("L. Tolstoy", "War and Peace", 10, true, 10.0);
        Book book6 = new Book("Sedgewick", "Algorithms", 10, true, 10.0);
        Book book7 = new Book("", "Java in Action", 10, true, 7.0);
        Book book8 = new Book("R. Martin", "Clean Code", 1, true, 10.0);
        Book book9 = new Book("Rowling", "Harry Potter. Goblet of Fire", 10, true, 10.0);
        Book book10 = new Book("Rowling", "Harry Potter. Order of the Phoenix", 10, true, 10.0);
        List<Book> books = new ArrayList<>(List.of(book1, book2, book3, book4, book5, book6, book7, book8, book9, book10));

        System.out.println("1 sort by Title");
        Collections.sort(books, new Book.BookComparatorByTitle());
        for (Book b : books) {
            System.out.println(b);
        }

        System.out.println("2 sort by Author");
        Collections.sort(books, new BookComparatorByAuthor()); // merge sort ---> stable ---> does not change order of sorted elements
        for (Book b : books) {
            System.out.println(b);
        }

        System.out.println("3 sort by Price from high to low");
        Comparator<Book> reversedComapatorByPrice = new Book.BookComparatorByPrice().reversed();
        Collections.sort(books, reversedComapatorByPrice); // by Price from high to low & by Author & by Title
        for (Book b : books) {
            System.out.println(b);
        }


        System.out.println("4 sort by Count");
        Collections.sort(books, new Comparator<Book>() { // sort by anonymous comparator
            @Override
            public int compare(Book o1, Book o2) {
                return Integer.compare(o1.getCount(), o2.getCount());
            }
        });
        for (Book b : books) {
            System.out.println(b);
        }

    }

}
