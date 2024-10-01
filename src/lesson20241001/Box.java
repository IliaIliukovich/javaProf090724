package lesson20241001;

import java.util.Objects;

public class Box {

    private Cat cat;

    public Box(Cat cat) {
        this.cat = cat;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Box{" +
                "cat=" + cat +
                '}';
    }

    @Override
    public boolean equals(Object another) {
        if (another == null || another.getClass() != this.getClass()) {
            return false;
        }
        Box anotherBox = (Box) another;
        return Objects.equals(this.cat, anotherBox.cat);
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat(null, 1);
        Cat cat2 = new Cat(null, 1);
        Box box1 = new Box(cat1);
        Box box2 = new Box(cat2);
        System.out.println(box1.equals(box2));
    }
}
