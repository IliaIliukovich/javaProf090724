package lesson20250107;

public class UseArrayBlockingQueue {

    public static void main(String[] args) {
        CustomReentrantLockArrayBlockingQueue queue = new CustomReentrantLockArrayBlockingQueue(5);
        new Thread(new Producer(queue), "Producer").start();
        new Thread(new Consumer(queue), "Consumer").start();
    }


    static class Producer implements Runnable {

        private CustomReentrantLockArrayBlockingQueue queue;

        public Producer(CustomReentrantLockArrayBlockingQueue queue) {
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

        private CustomReentrantLockArrayBlockingQueue queue;

        public Consumer(CustomReentrantLockArrayBlockingQueue queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            while (true) {
                System.out.println("Queue size: " + queue.size());
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
