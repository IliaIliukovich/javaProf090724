package lesson20241219;

public class ThreadWithFlag {


    volatile static boolean flag = true;

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            long i = 0;
            while (flag) {
//            while (!Thread.interrupted()) {
                i++;
                if (i % 1_000_000 == 0) {
                    System.out.println(i);
                }
            }
        });
        thread.start();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        thread.interrupt(); // 2705000000 2702000000
//        flag = false; // 2892000000 3006000000 2958000000
        flag = false; // volatile --- 2359000000 2341000000 2389000000
    }

}
