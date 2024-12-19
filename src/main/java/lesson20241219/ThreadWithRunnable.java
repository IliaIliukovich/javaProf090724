package lesson20241219;

public class ThreadWithRunnable {

    public static void main(String[] args) {
        Runnable r1 = () -> {System.out.println(Thread.currentThread().getName() + " task1");};
        Runnable r2 = () -> {System.out.println(Thread.currentThread().getName() + " task2");};


        r1.run(); // In Main thread -- task 1

        Thread thread1 = new Thread(r1);
        Thread thread2 = new Thread(r1);

        thread1.start(); // In Thread-0 -- task 1
        thread2.start(); // In Thread-1 -- task 1

        Thread thread3 = new Thread(r2);
        thread3.start(); // In Thread-2 -- task 2
    }



}
