package lesson20241217;

public class ThreadExamples {

    public static void main(String[] args) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Thread thread = Thread.currentThread();
        System.out.println(thread);
        System.out.println(thread.getName());
        System.out.println(thread.getState());


        Runnable task = () -> {
          System.out.println("Doing task in thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finished task: " + Thread.currentThread().getName());
        };

        Thread newThread1 = new Thread(task, "CustomThread1");
        newThread1.start();


        Thread newThread2 = new Thread("CustomThread2") {
            @Override
            public void run() {
                System.out.println("Doing task in thread: " + Thread.currentThread().getName());
                try {
                    Thread.sleep(20000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Finished task: " + Thread.currentThread().getName());
            }
        };
        newThread2.start();

        Thread newThread3 = new MyThread();
        newThread3.start();


    }




}
