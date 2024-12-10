package practice20241029;

import lesson20241029.comparator.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTask {

    public static void main(String[] args) {

        Book book1 = new Book("Rowling", "Harry Potter. Philosopher's Stone", 20, true, 15.0);
        Book book2 = new Book("Rowling", "Harry Potter. Chamber of Secrets", 10, true, 15.0);
        Book book3 = new Book("Rowling", "Harry Potter. Prisoner of Azkaban", 10, true, 15.0);
        Book book4 = new Book("M. Twain", "Tom Sawyer", 10, true, 10.0);
        Book book5 = new Book("L. Tolstoy", "War and Peace", 10, true, 10.0);
        Book book6 = new Book("Sedgewick", "Algorithms", 10, true, 10.0);
        Book book7 = new Book("", "Java in Action", 10, true, 7.0);
        Book book8 = new Book("R. Martin", "Clean Code", 1, true, 10.0);
        Book book9 = new Book("Rowling", "Harry Potter. Goblet of Fire", 10, true, 15.0);
        Book book10 = new Book("Rowling", "Harry Potter. Order of the Phoenix", 10, true, 15.0);
        List<Book> books = new ArrayList<>(List.of(book1, book2, book3, book4, book5, book6, book7, book8, book9, book10));

        System.out.println("Sort By Title");
        bubbleSort(books, new Book.BookComparatorByTitle());
        for (Book b : books) {
            System.out.println(b);
        }

        System.out.println("Sort By Price");
        bubbleSort(books, new Book.BookComparatorByPrice());
//        Collections.sort(books, new Book.BookComparatorByPrice()); // mergesort O(n log n)
        for (Book b : books) {
            System.out.println(b);
        }

    }

    public static void bubbleSort(List<Book> books, Comparator<Book> comparator) {
        // first operation - make copy to array or ArrayList
//        List<Book> copy = new ArrayList<>(books); // O(n) operations
        for (int i = 0; i < books.size(); i++) { // n
            boolean isSorted = true;
            for (int j = 0; j < books.size() - i - 1; j++) { // n / 2
                if (comparator.compare(books.get(j), books.get(j + 1)) > 0) { // 1 --- n
                    swap(books, j, j + 1); // 1 --- n
                    isSorted = false;
                }
            }
            if (isSorted) break;
        }
        // last operation - write sorted copy to books
    }
    // n * n / 2 * n ---> O(n^3) for LinkedList
    // n * n / 2  ---> O(n^2) for ArrayList

    public static void selectionSort(List<Book> books, Comparator<Book> comparator) {
        for (int i = 0; i < books.size(); i++) { // n
            Book minBook = books.get(i);
            int indexMinBook = i;
            for (int j = i + 1; j < books.size(); j++) { // n / 2
                if (comparator.compare(minBook, books.get(j)) > 0) {
                    minBook = books.get(j);
                    indexMinBook = j;
                }
            }
            swap(books, i, indexMinBook);
        }
    } // O(n^2) for ArrayList

    public static void swap(List<Book> books, int i, int j) {
        if (i != j) {
            Book temp = books.get(i);
            books.set(i, books.get(j));
            books.set(j, temp);
        }
    }



}
