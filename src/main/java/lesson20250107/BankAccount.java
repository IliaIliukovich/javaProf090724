package lesson20250107;

public class BankAccount {

    // 2. В банке имеется два счета. Реализовать потокобезопасным способом:
    //- перевод денег со счета A на счет Б
    //- извлечение информации о сумме счета A и счета Б
    //- извлечение общей суммы на двух счетах

    private int accountA;

    private int accountB;

//    private Object innerMutex = new Object();

    public BankAccount(int accountA, int accountB) {
        this.accountA = accountA;
        this.accountB = accountB;
    }

    public synchronized void transferMoneyFromAtoB(int amount){
        accountA = accountA - amount;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        accountB = accountB + amount;
    }

    public synchronized int getAccountA() {
        return accountA;
    }

    public synchronized int getAccountB() {
        return accountB;
    }

    public synchronized int getBalance() {
        return accountA + accountB;
    }


    public static void main(String[] args) {
        BankAccount a = new BankAccount(100, 0);
        Thread thread1 = new Thread(() -> a.transferMoneyFromAtoB(10));
        thread1.start();

        Thread thread2 = new Thread(() -> a.transferMoneyFromAtoB(10));
        thread2.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("a.accountA = " + a.getAccountA() + ", a.accountB = " + a.getAccountB() + ", total amount: " + a.getBalance());

        synchronized (a) {
            int sum = a.getAccountA() + a.getAccountB();
            System.out.println("Total sum: " + sum);
        }

        BankAccount b = new BankAccount(100, 0);
        b.transferMoneyFromAtoB(30);


    }
}
