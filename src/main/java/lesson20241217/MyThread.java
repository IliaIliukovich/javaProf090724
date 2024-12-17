package lesson20241217;

public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("Doing task in thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(25000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished task: " + Thread.currentThread().getName());
    }

}
