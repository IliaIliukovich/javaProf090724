package summary20241220;

public class ThreadStarvation {

    public static void main(String[] args) {

        Object mutex = new Object();

        new Thread(() -> {
            while (true) {
                synchronized (mutex) {
                    System.out.println(Thread.currentThread().getName() + " in synch block");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                synchronized (mutex) {
                    System.out.println(Thread.currentThread().getName() + " in synch block");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
        }).start();


    }



}
