package lesson20241105.hashcode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class BankAccount {

    private int accountA;

    private int accountB;

    private boolean isActive;

    public BankAccount(int accountA, int accountB, boolean isActive) {
        this.accountA = accountA;
        this.accountB = accountB;
        this.isActive = isActive;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        BankAccount bankAccount = (BankAccount) object;
        return accountA == bankAccount.accountA
                && accountB == bankAccount.accountB
                && isActive == bankAccount.isActive;
    }

//    @Override
//    public int hashCode() {
//        int value = isActive ? 1 : 0;
//        return 31 * 31 * accountA + 31 * accountB + value;
//    }

    @Override
    public int hashCode() {
        return Objects.hash(accountA, accountB, isActive);
    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "accountA=" + accountA +
                ", accountB=" + accountB +
                ", isActive=" + isActive +
                '}';
    }

    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount(10, 10, false);
        BankAccount bankAccount2 = new BankAccount(10, 10, true);
        System.out.println(bankAccount1.equals(bankAccount2));
        System.out.println(bankAccount1.hashCode());
        System.out.println(bankAccount2.hashCode());

        // o1.equals(o2) == true ----> hash1 == hash2
        Set<BankAccount> bankAccountSet = new HashSet<>();
        bankAccountSet.add(bankAccount1);
        bankAccountSet.add(bankAccount2);
        System.out.println(bankAccountSet);
    }
}
