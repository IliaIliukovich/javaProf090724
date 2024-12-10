package lesson20241010.classrelations;

public class Car {

    private Motor motor = new Motor(); // композиция

    private Driver driver; // агрегация

    public Car(Driver driver) {
        this.driver = driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }


    public static void main(String[] args) {
        Driver tom = new Driver();
        Car car = new Car(tom);

        Driver peter = new Driver();
        car.setDriver(peter);

        Motor anotherMotor = new Motor();
    }
}
