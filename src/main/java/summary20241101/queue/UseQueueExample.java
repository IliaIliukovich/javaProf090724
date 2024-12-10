package summary20241101.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class UseQueueExample {

    static class Producer {

        private Queue<String> queue;

        public Producer(Queue<String> queue) {
            this.queue = queue;
        }

        public void generateData() {
            for (int i = 0; i < 5; i++) {
                String element = "data from " + this.toString() + " " + i ;
                System.out.println("Generating data: " + element);
                queue.add(element);
            }
        }


    }


    static class Consumer {

        private String name;

        private Queue<String> queue;

        public Consumer(String name, Queue<String> queue) {
            this.name = name;
            this.queue = queue;
        }

        public void processData() {
//            while (!queue.isEmpty()) {
//                String element = queue.remove();
//                System.out.println("Processing data: " + element);
//            }

                String element = queue.poll();
                System.out.println(name + " processing data: " + element);
        }

    }

    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        Producer producer1 = new Producer(queue);
        Producer producer2 = new Producer(queue);
        Consumer consumer1 = new Consumer("A", queue);
        Consumer consumer2 = new Consumer("B", queue);
        Consumer consumer3 = new Consumer("C", queue);

        producer1.generateData();
        producer2.generateData();
        while (!queue.isEmpty()) {
            consumer1.processData();
            consumer2.processData();
            consumer3.processData();
        }
    }

}
