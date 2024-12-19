package lesson20241219;

public class DeadLockExample {

    static Object water = new Object();
    static Object meat = new Object();

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        new Thread(dog1, "Dog1").start();

//        Dog dog2 = new Dog();
//        new Thread(dog2, "Dog2").start();

        Cat cat = new Cat();
        new Thread(cat, "Cat").start();
    }

    static class Dog implements Runnable {
        @Override
        public void run() {
            synchronized (meat) {
                System.out.println(Thread.currentThread().getName() + " eats meat");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (water) {
                    System.out.println(Thread.currentThread().getName() + " drinks water");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }

    static class Cat implements Runnable {
        @Override
        public void run() {
            synchronized (water) {
                System.out.println(Thread.currentThread().getName() + " drinks water");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (meat) {
                    System.out.println(Thread.currentThread().getName() + " eats meet");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }









}
