package summary20241101.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {


    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println(queue.peek());
        queue.contains("B");
        queue.iterator();


        // FIFO with exception
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());

        // FIFO without exception
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.size());

        Queue<Integer> integerQueue = new LinkedList<>();
        integerQueue.add(1);
        integerQueue.add(2);
        integerQueue.add(2);
        System.out.println(integerQueue.remove());
        System.out.println(integerQueue.remove());
        System.out.println(integerQueue.remove());
    }


}
