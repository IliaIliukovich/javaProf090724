package lesson20250109.hometask;

public class StateAsObjectRaceCondition {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000, 1000);
        AccountManager accountManager = new AccountManager(bankAccount);

        new Thread(() -> {
            while (true) {
                accountManager.moveMoneyAToB(10);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        while (true) {
            BankAccount account = accountManager.getBankAccount();
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int accountA;
            int accountB;
//            synchronized (accountManager) {
                accountA = account.getAccountA();
                accountB = account.getAccountB();
//            }
            int balance = accountA + accountB;
            System.out.println("accountA: " + accountA + ", accountB: " + accountB + ", total balance: " + balance);
        }

    }




}
