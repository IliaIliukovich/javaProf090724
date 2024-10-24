package lesson20241017.customiterator;

import java.util.*;

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
        return new Iterator<>() {
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
        };
    }

    public Iterator<String> reverseIterator() {
        return new MyReverseIterator();
    }

    public Iterator<String> randomIterator() {
        return new MyRandomIterator();
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
//            Collections.swap();
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
        // Option 1 - n log (n) operations algorithm
        // data ---> dataPlusRandomNumbers
        // Arrays.sort(dataPlusRandomNumbers);

        // Option 2 - n operations - more fast algorithm
        Random random = new Random();
        for (int i = 1; i < data.length; i++) {
            int j = random.nextInt(i + 1);
            swap(data, i, j);
        }
    }

    public static void swap(String[] data, int i, int j){
        if (i != j) {
            String tmp = data[i];
            data[i] = data[j];
            data[j] = tmp;
        }
    }
}
