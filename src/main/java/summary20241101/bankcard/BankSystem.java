package summary20241101.bankcard;

import java.util.Set;
import java.util.TreeSet;

public class BankSystem {

    public static void main(String[] args) {
        MasterCard masterCard1 = new MasterCard(123);
        MasterCard masterCard2 = new MasterCard(124);
        Visa visa1 = new Visa(542642);
        Visa visa2 = new Visa(34936);
        Paypal paypal = new Paypal(427247, "Tom", "Smiths", "sdbkadfb");

        Set<Card> set = new TreeSet<>();
        set.add(masterCard1);
        set.add(masterCard2);
        set.add(visa1);
        set.add(visa2);
        set.add(paypal);
//        set.add("qdadndn"); // impossible

        System.out.println(set);
    }


}
