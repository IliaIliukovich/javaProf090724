package lesson20250107.blockingqueue;

public class UseBlockingQueue {

    public static void main(String[] args) {
        CustomLinkedBlockingQueue queue = new CustomLinkedBlockingQueue();
        new Thread(new Producer(queue), "Producer").start();
        new Thread(new Consumer(queue), "Consumer1").start();
        new Thread(new Consumer(queue), "Consumer2").start();
        new Thread(new Consumer(queue), "Consumer3").start();
    }


    static class Producer implements Runnable {

        private CustomLinkedBlockingQueue queue;

        public Producer(CustomLinkedBlockingQueue queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            for (int i = 0; i < 15; i++) {
                String data = "Data from " + Thread.currentThread().getName() + " " + i;
                System.out.println("Generating: " + data);
                queue.put(data);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Consumer implements Runnable {

        private CustomLinkedBlockingQueue queue;

        public Consumer(CustomLinkedBlockingQueue queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            while (true) {
                String taken = queue.take();
                System.out.println(Thread.currentThread().getName() + " working with: " + taken);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }




}
