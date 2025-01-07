package lesson20250107;

public class CaffeTask {

      // Реализовать модель кафе:
        // посетитель (отдельный поток)
        // - заходит в кафе
        // - делает заказ
        // - ждет кофе
        // - пьет кофе
        // официант (отдельный поток)
        // - ждет посетителя
        // - готовит кофе
        // - приносит посетителю

    static Object visitorComes = new Object();
    static Object coffeeIsReady = new Object();

    public static void main(String[] args) {
        new Thread(new Waiter(), "Waiter").start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(new Visitor(), "Visitor1").start();

//        try {
//            Thread.sleep(6000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//
//        new Thread(new Visitor(), "Visitor2").start();
    }


    static class Visitor implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " enters cafe");
            synchronized (visitorComes) {
                visitorComes.notify();
            }

            System.out.println(Thread.currentThread().getName() + " makes order");
            System.out.println(Thread.currentThread().getName() + " waits for coffee");
            synchronized (coffeeIsReady) {
                try {
                    coffeeIsReady.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " drinks coffee");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " leaves cafe");
        }
    }

    static class Waiter implements Runnable {

        @Override
        public void run() {

            while (true) {
                System.out.println(Thread.currentThread().getName() + " waiting for visitor");
                synchronized (visitorComes) {
                    try {
                        visitorComes.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(Thread.currentThread().getName() + " cooking coffee");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + " brings coffee to visitor");
                synchronized (coffeeIsReady) {
                    coffeeIsReady.notify();
                }
            }
        }
    }

}
