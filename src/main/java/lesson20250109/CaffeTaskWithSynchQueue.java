package lesson20250109;

import java.util.List;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.SynchronousQueue;

public class CaffeTaskWithSynchQueue {

      // Реализовать модель кафе:
        // посетитель (отдельный поток)
        // - заходит в кафе
        // - делает заказ
        // - ждет заказ
        // - ест блюдо
        // официант (отдельный поток)
        // - ждет посетителя
        // - готовит заказ
        // - приносит посетителю

    static BlockingQueue<String> orderQueue = new SynchronousQueue<>(true);
    static BlockingQueue<String> cookedDishesQueue = new SynchronousQueue<>(true);
    static Semaphore semaphore = new Semaphore(3, true);

    public static void main(String[] args) {
        new Thread(new ChefCook(), "Cook").start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int i = 1;
        List<String> dishes = List.of("Pizza", "Spaghetti", "Coffee", "Pork", "Hamburger");
        while (true) {
            new Thread(new Visitor(dishes.get(new Random().nextInt(dishes.size()))), "Visitor " + i++).start();
            try {
                Thread.sleep(5000 + new Random().nextInt(5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


    static class Visitor implements Runnable {

        String meal;

        public Visitor(String meal) {
            this.meal = meal;
        }

        @Override
        public void run() {
           try {
                System.out.println(Thread.currentThread().getName() + " comes to cafe");
                semaphore.acquire();
                System.out.println(Thread.currentThread().getName() + " enters cafe");
                System.out.println(Thread.currentThread().getName() + " makes order");
                orderQueue.put(meal);
                System.out.println(Thread.currentThread().getName() + " waits for the order");
                String cookedMeal = cookedDishesQueue.take();
                System.out.println(Thread.currentThread().getName() + " enjoys " + cookedMeal);
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName() + " leaves cafe");
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class ChefCook implements Runnable {

        @Override
        public void run() {

            while (true) {
                try {
                    System.out.println(Thread.currentThread().getName() + " waiting for visitor");
                    String order = orderQueue.take();
                    System.out.println(Thread.currentThread().getName() + " cooking " + order);
                    Thread.sleep(5000);
                    System.out.println(Thread.currentThread().getName() + " brings order to visitor");
                    cookedDishesQueue.put(order);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
