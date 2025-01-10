package summary20250110;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConcurrentCollectionsExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> synchronizedList = Collections.synchronizedList(list);
        synchronizedList.add("A"); // thread safe
        synchronizedList.add("B");
        synchronizedList.add("C");
        synchronizedList.add("D");
        synchronizedList.add("E");

        String element = synchronizedList.get(3);  // thread safe

        for (String data : synchronizedList) { // not thread safe
            System.out.println(data);
        }

        synchronized (synchronizedList) { // thread safe
            for (String data : synchronizedList) {
                System.out.println(data);
            }
        }

    }


}
