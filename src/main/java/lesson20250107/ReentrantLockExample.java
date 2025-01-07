package lesson20250107;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

    static int count = 0;

    static ReentrantLock lock = new ReentrantLock(true);


    public static void main(String[] args) {

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                increment();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                increment();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(count);
    }

//    private synchronized static void increment() {
//        count++;
//    }

        private static void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }


}
