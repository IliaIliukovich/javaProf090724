package lesson20241001.interfaces;

public class Main {

    public static void main(String[] args) {
        Bird bird = new Sparrow("Sparrow");
        bird.fly();
        Sparrow sparrow = (Sparrow) bird;
        sparrow.sing();
        sparrow.walk();

        Plane plane = new Plane(200, "Airbus");
        plane.fly();

        startFlight(bird, plane);
    }

    public static void startFlight(Flyable... flyables) {
        for (Flyable f : flyables) {
            f.fly();
        }
    }

}
