package lesson20241017.customiterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList implements Iterable<String> {

    private String[] data;

    public MyArrayList(String[] data) {
        this.data = data;
    }

    public void add(String element) {
        // logic for adding element
    }

    @Override
    public Iterator<String> iterator() {
        return new MyIterator();
    }

    public Iterator<String> reverseIterator() {
        return new MyReverseIterator();
    }


    private class MyIterator implements Iterator<String> {

        private int index = 0;
        @Override
        public boolean hasNext() {
            return data.length > index;
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return data[index++];
        }
    }

    private class MyReverseIterator implements Iterator<String> {
        private int index = data.length - 1;
        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return data[index--];
        }
    }

}
