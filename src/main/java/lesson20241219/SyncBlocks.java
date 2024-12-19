package lesson20241219;

public class SyncBlocks {


    public static void main(String[] args) {

        Object mutex = new Object();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " works");

            synchronized (mutex) {
                System.out.println(Thread.currentThread().getName() + " works with common resource");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "MyThread1").start();


        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " works");

            synchronized (mutex) {
                System.out.println(Thread.currentThread().getName() + " works with common resource");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "MyThread2").start();


        synchronized (mutex) {
            System.out.println(Thread.currentThread().getName() + " works with common resource");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }




}
