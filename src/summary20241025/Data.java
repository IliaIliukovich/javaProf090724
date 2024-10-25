package summary20241025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Data implements Comparable<Data>{

    private String data;

    private int count;

    public Data(String data, int count) {
        this.data = data;
        this.count = count;
    }

    @Override
    public int compareTo(Data another) {
        int result = data.compareTo(another.data);
        if (result == 0) {
            result = count - another.count;
        }
        return result;
    }

//    @Override // reverse order
//    public int compareTo(Data another) {
//        int result = another.data.compareTo(data);
//        if (result == 0) {
//            result = another.count - count;
//        }
//        return result;
//    }

    @Override
    public String toString() {
        return "Data{" +
                "data='" + data + '\'' +
                ", count=" + count +
                '}';
    }



    public static void main(String[] args) {
        Data data1 = new Data("stick", 12);
        Data data2 = new Data("book", 23);
        Data data3 = new Data("umbrella", 11);
        Data data4 = new Data("coffee", 2);
        Data data5 = new Data("box", 32);
        Data data6 = new Data("box", 50);
        List<Data> list = new ArrayList<>(List.of(data1, data2, data3, data4, data6, data5));

        Data dataFromList = list.get(2);
        String dataValueFromList = dataFromList.data;

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }


}
