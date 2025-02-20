package lesson20241212;

import java.util.Iterator;

public class CustomDynamicArray implements Iterable<Integer> {

    private Integer[] data;
    private int count;
    private int size;

    public CustomDynamicArray() {
        this.data = new Integer[1];
        this.count = 0;
        this.size = 1;
    }

    public CustomDynamicArray(int size) {
        this.data = new Integer[size];
        this.count = 0;
        this.size = size;
    }

    public synchronized void add(int element){ // O(1) amortized,  O(n) - worst case
        if (count == size){
            growSize();
        }
        data[count++] = element;
    }

    public synchronized void addAt(int index, int element){ // O(n)
        if (index < 0 || index >= count) throw new RuntimeException("Index is out of bounds");
        if (count == size){
            growSize();
        }
        for (int i = count - 1; i >= index ; i--) {
            data[i + 1] = data[i];
        }
        data[index] = element;
        count++;
    }

    private void growSize() {
        Integer[] newArray = new Integer[size * 2];
        for (int i = 0; i < data.length; i++) {
            newArray[i] = data[i];
        }
        data = newArray;
        size = size * 2;
    }

    public synchronized void shrinkSize(){ // O(n)
        if (count < size){
            Integer[] newArray = new Integer[count];
            for (int i = 0; i < count; i++) {
                newArray[i] = data[i];
            }
            data = newArray;
            size = count;
        }
    }

    public synchronized void remove(){ // O(1)
        data[--count] = null; // make link to object null for GC
    }

    public synchronized void removeAt(int index){ // O(n)
        if (index < 0 || index >= count) throw new RuntimeException("Index is out of bounds");

        for (int i = index; i < count; i++) {
            data[i] = data[i+1];
        }
        data[--count] = null;
    }

    public synchronized void set(int index, int element){ // O(1)
        if (index < 0 || index >= count) throw new RuntimeException("Index is out of bounds");
        data[index] = element;
    }

    public synchronized int get(int index){ // O(1)
        if (index < 0 || index >= count) throw new RuntimeException("Index is out of bounds");
        return data[index];
    }

    public synchronized void clear(){ // O(1)
        data = new Integer[0];
        size = 1;
        count = 0;
    }

    public synchronized int contains(int element){ // O(n)
        for (int i = 0; i < count; i++) {
            if (data[i] == element) return i;
        }
        return -1;
    }

    public synchronized boolean isEmpty(){ // O(1)
        return count == 0;
    }

    @Override
    public synchronized String toString() {
        StringBuilder result = new StringBuilder("CustomDynamicArray[");
        for (int i = 0; i < count; i++) {
            result.append(data[i]).append(", ");
        }
        result.append("]");
        return result.toString();
    }

    @Override
    public synchronized Iterator<Integer> iterator() {
        return new Iterator<>() {
            int currentIndex = 0;
            @Override
            public boolean hasNext() {
                synchronized (CustomDynamicArray.this) {
                    return currentIndex < count;
                }
            }
            @Override
            public Integer next() {
                synchronized (CustomDynamicArray.this) {
                    if (!hasNext()) throw new RuntimeException("No elements present");
                    return data[currentIndex++];
                }
            }
        };
    }
}
