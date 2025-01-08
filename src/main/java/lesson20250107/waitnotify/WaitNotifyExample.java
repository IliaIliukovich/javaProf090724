package lesson20250107.waitnotify;

public class WaitNotifyExample {

    static Object mutex = new Object();

    public static void main(String[] args) {

        new Thread(new Task()).start();
        new Thread(new Task()).start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (mutex) {
            mutex.notifyAll();
        }

    }


    static class Task implements Runnable {

        @Override
        public void run() {

           synchronized (mutex) {
               try {
                   System.out.println(Thread.currentThread().getName() + " waiting");
                   mutex.wait();
                   System.out.println(Thread.currentThread().getName() + " awaken");
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
           System.out.println(Thread.currentThread().getName() + " left synch block");

            while (true) {
                System.out.println(Thread.currentThread().getName() + " doing task");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }


}
