package lesson20241217;

import java.time.LocalTime;

public class DaemonThreads {

    public static void main(String[] args) {
        System.out.println("Main thread start");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread thread = new Thread(() -> {
            int i = 0;
            while (true) {
                System.out.println(Thread.currentThread().getName() + " running i = " + i++ + " " + LocalTime.now());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.setDaemon(true);
        thread.setPriority(10);

//        thread.run(); // in main thread
        thread.start();


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread end");
    }


}
