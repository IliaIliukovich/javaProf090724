package lesson20241219;

public class AwakeningThreads {

    public static void main(String[] args) {


        Thread thread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Doing task");
                for (int i = 0; i < 100_000_000; i++) {
                    // soma actions
                }
                System.out.println("Sleeping");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
//                    break;
                }
            }
            System.out.println("After exiting loop");

        });
        thread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt();

    }




}
