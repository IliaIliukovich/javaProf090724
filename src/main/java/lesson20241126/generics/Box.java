package lesson20241126.generics;

public class Box <Item> {

    private Item item;

    public void put(Item item) {
        this.item = item;
    }

    public Item get() {
        return item;
    }

    public Item remove() {
        Item tmp = item;
        item = null;
        return tmp;
    }

    @Override
    public String toString() {
        return "Box{" +
                "item=" + item +
                '}';
    }
}
