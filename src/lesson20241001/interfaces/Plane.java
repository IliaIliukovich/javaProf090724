package lesson20241001.interfaces;

public class Plane extends Vehicle implements Flyable {
    private String modelName;

    public Plane(int capacity, String modelName) {
        super(capacity);
        this.modelName = modelName;
    }

    @Override
    public void fly() {
        System.out.println("Plane " + this.modelName + " flies");
    }
}
