package lesson20241029;

import summary20241025.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataStorage implements Comparable<DataStorage>{

    private Data data;
    private Double weight;
    private int version;
    private boolean isActive;

    public DataStorage(Data data, Double weight, int version, boolean isActive) {
        this.data = data;
        this.weight = weight;
        this.version = version;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "DataStorage{" +
                "data=" + data +
                ", weight=" + weight +
                ", version=" + version +
                ", isActive=" + isActive +
                '}';
    }

    @Override
    public int compareTo(DataStorage another) {
//        this.data.getCount();
//        this.data.getData();
        int result = this.data.compareTo(another.data);
        if (result == 0) {
//            result = this.weight < another.weight ? -1 : this.weight == another.weight ? 0 : 1;
            result = this.weight.compareTo(another.weight);
        }
        if (result == 0) {
            result = Integer.compare(this.version, another.version);
//            result = this.version - another.version; // bad version in case of big values
//            result = this.version < another.version ? -1 : this.version == another.version ? 0 : 1;
        }
        if (result == 0) {
            result = Boolean.compare(this.isActive, another.isActive);
//            result = this.isActive ? (!another.isActive ? 1 : 0) : (!another.isActive) ? 0 : -1;
        }
        return result;
    }

    public static void main(String[] args) {
        DataStorage data1 = new DataStorage(new Data("data1", 1), 10.0, 1, true);
        DataStorage data2 = new DataStorage(new Data("data1", 1), 10.0, 1, false);
        DataStorage data3 = new DataStorage(new Data("data2", 1), 10.0, 2, true);
        DataStorage data4 = new DataStorage(new Data("data2", 1), 10.0, 1, true);
        DataStorage data5 = new DataStorage(new Data("data3", 1), 15.0, 1, true);
        DataStorage data6 = new DataStorage(new Data("data3", 1), 10.0, 1, true);
        List<DataStorage> storages = new ArrayList<>(List.of(data1, data2, data3, data4, data5, data6));
        List<DataStorage> copy = new ArrayList<>(storages);
        Collections.sort(copy);

        for (DataStorage d : storages) {
            System.out.println(d);
        }
        System.out.println("------");
        for (DataStorage d : copy) {
            System.out.println(d);
        }
    }
}
