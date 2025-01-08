package lesson20250107.waitnotify;

public class BusyWaitExample {

    static volatile boolean shouldStart = false;

    public static void main(String[] args) {

        new Thread(new Task()).start();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        shouldStart = true;

    }


    static class Task implements Runnable {

        @Override
        public void run() {

            while (!shouldStart) {
                // busy wait
            }

            while (true) {
                System.out.println("Doing task");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }





}
