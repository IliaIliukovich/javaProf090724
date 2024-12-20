package summary20241220;

public class SynchMethods {

    public static void main(String[] args) {
        SynchMethods object = new SynchMethods();

        // non-static sync:
        object.method();
        new Thread(object::method).start();
        new Thread(object::method).start();

        synchronized (object) {
            System.out.println("Additional action");
        }

        // static sync:
        new Thread(SynchMethods::staticMethod).start();

        synchronized (SynchMethods.class) {
            System.out.println("Additional action in sync with staticMethod");
        }

    }


    synchronized public void method(){
//        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " in synch method");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//        }
    }

    synchronized public static void staticMethod() {
//        synchronized (SynchMethods.class) {
            System.out.println(Thread.currentThread().getName() + " in static synch method");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//        }
    }



}
