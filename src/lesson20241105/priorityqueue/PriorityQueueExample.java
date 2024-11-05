package lesson20241105.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        queue.add("text"); // log(n)
        queue.add("some");
        queue.add("random");
        queue.add("abc");
        queue.add("zero");

        System.out.println(queue); // binary heap representation

        System.out.println(queue.remove()); // log(n)
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }


}
