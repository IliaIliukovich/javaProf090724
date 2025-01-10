package lesson20250109.hometask;

public class BankAccount {
    private int accountA;
    private int accountB;

    public BankAccount(int accountA, int accountB) {
        this.accountA = accountA;
        this.accountB = accountB;
    }

    public int getAccountA() {
        return accountA;
    }

    public void setAccountA(int accountA) {
        this.accountA = accountA;
    }

    public int getAccountB() {
        return accountB;
    }

    public void setAccountB(int accountB) {
        this.accountB = accountB;
    }
}
