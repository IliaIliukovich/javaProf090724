package lesson20241017.customiterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList implements Iterable<String> {

    private String[] data;

    public void add(String element) {
        // logic for adding element
    }

    public MyArrayList(String[] data) {
        this.data = data;
    }

    @Override
    public Iterator<String> iterator() {
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
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public String next() {
            return null;
        }
    }

}
