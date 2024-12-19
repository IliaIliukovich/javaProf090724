package lesson20241217;

public class RaceCondition {

    static int counter;

    public static void main(String[] args) {

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(counter++);
//                int tmp = counter;
//                tmp++;
//                counter = tmp;

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(counter++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Result: " + counter);
    }



}
