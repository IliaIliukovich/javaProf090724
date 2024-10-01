package lesson20241001.interfaces;

public class Sparrow extends Bird implements Songable, Walkable {
    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void sing() {
        System.out.println("Chik-chirik!");
    }

    @Override
    public void walk() {
        System.out.println("Sparrow walks");
    }
}
