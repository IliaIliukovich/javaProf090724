package lesson20250107.synchronization;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockUse {

    public static void main(String[] args) {

        ReentrantLock lock = new ReentrantLock(true);

        new Thread(() -> {
            while (true) {
                lock.lock();
                try {
                    System.out.println(Thread.currentThread().getName() + " in synch block");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } finally {
                    lock.unlock();
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                lock.lock();
                try {
                    System.out.println(Thread.currentThread().getName() + " in synch block");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } finally {
                    lock.unlock();
                }
            }
        }).start();


    }



}
