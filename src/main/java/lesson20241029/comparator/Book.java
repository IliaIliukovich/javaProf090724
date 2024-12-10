package lesson20241029.comparator;

import java.util.Comparator;

public class Book {

    private String author;
    private String title;
    private int count;
    private boolean canBeSold;
    private double price;

    public Book(String author, String title, int count, boolean canBeSold, double price) {
        this.author = author;
        this.title = title;
        this.count = count;
        this.canBeSold = canBeSold;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getCount() {
        return count;
    }

    public boolean isCanBeSold() {
        return canBeSold;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", count=" + count +
                ", canBeSold=" + canBeSold +
                ", price=" + price +
                '}';
    }

    public static class BookComparatorByTitle implements Comparator<Book> {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    }

    public static class BookComparatorByPrice implements Comparator<Book> {
        @Override
        public int compare(Book o1, Book o2) {
            return Double.compare(o1.getPrice(), o2.getPrice());
        }
    }
}
