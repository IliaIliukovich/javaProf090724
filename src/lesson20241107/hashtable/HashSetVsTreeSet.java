package lesson20241107.hashtable;

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
    }


}
