package lesson20241001.interfaces;

public abstract class Bird implements Flyable {

    private String name;

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println("Bird " + this.name + " flies");
    }
}
