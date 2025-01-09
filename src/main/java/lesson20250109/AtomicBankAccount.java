package lesson20250109;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicBankAccount {

    static AtomicInteger account = new AtomicInteger(0);

    // Имеется общий счет. Два пользователя раз в 1 сек. кладут 10 $ на этот счет.
    // Реализовать потокобезопасным способом.

    public static void main(String[] args) {
        new Thread(() -> {
            while (true) {
                boolean success;
                do {
                    int currentValue = account.get();
                    int old = currentValue;
                    currentValue += 5;
                    currentValue += 5;
                    success = account.compareAndSet(old, currentValue);
                } while (!success);

                System.out.println(account.get());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                int result = account.addAndGet(10);
//                account.addAndGet(10); // two call together not atomic ----> not thread safe
                System.out.println(result);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }


}
