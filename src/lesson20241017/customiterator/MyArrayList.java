package lesson20241017.customiterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

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

    public Iterator<String> randomIterator() {
        return new MyRandomIterator();
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

    private class MyRandomIterator implements Iterator<String> {

        int index = 0;
        String[] copy;

        MyRandomIterator() {
            copy = Arrays.copyOf(data, data.length);
            shuffle(copy);
//            Collections.shuffle();
        }

        @Override
        public boolean hasNext() {
            return copy.length > index;
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return copy[index++];
        }

    }


    public static void shuffle(String[] data) {
        // Option 1
        // data ---> dataPlusRandomNumbers
        // Arrays.sort(dataPlusRandomNumbers); // n log (n) algorithm

        // Option 2
        Random random = new Random(); // n -- more fast algorithm
        for (int i = 1; i < data.length; i++) {
            int j = random.nextInt(i + 1);
            swap(data, i, j);
        }
    }

    public static void swap(String[] data, int i, int j){
        String tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }
}
