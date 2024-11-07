package lesson20241107.hashtable;

import lesson20241105.hashcode.BankAccount;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetVsTreeSet {

    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("A"); // log(n)
        treeSet.add("X");
        treeSet.add("D");
        treeSet.add("K");
        System.out.println(treeSet);
        Set<String> hashSet = new HashSet<>(16, 0.1f); // more space --> faster
        hashSet = new HashSet<>(16, 0.9f); // less space --> slower
        hashSet = new HashSet<>(16, 0.75f); // default

        hashSet.add("A"); // O(1)
        hashSet.add("X");
        hashSet.add("D");
        hashSet.add("K");
        System.out.println(hashSet);
        System.out.println(hashSet.contains("D")); // O(1)
        hashSet.remove("X"); // O(1)

        BankAccount bankAccount1 = new BankAccount(10, 10, false);
        BankAccount bankAccount2 = new BankAccount(10, 10, true);

        Set<BankAccount> bankAccountSet = new HashSet<>(); // equals() must be consistent hashcode()
                                                            // o1.equals(o2) == true ----> hash1 == hash2
        bankAccountSet.add(bankAccount1);
        bankAccountSet.add(bankAccount2);
        System.out.println(bankAccountSet);

        bankAccountSet = new TreeSet<>(); // compareTo() must be consistent with equals()
                                            // o1.compareTo(o2) == 0 <----> o1.equals(o2.) == true
        bankAccountSet.add(bankAccount1);
        bankAccountSet.add(bankAccount2);
        System.out.println(bankAccountSet);
    }


}
