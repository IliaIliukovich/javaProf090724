package lesson24092024.init;

public class Parking {

    public static void main(String[] args) {
//        Car.displayCarCount();


        Car whiteCar = new Car("White");
        Car yellowCar = new Car("Yellow");

//        Car.displayCarCount();

        // 1 static field init
        // 2 static block init
        // 3 non-static field init
        // 4 non-static block init
        // 5 constructor works

        Car[] carsAtTheParikng = new Car[] {whiteCar, yellowCar};
        washCars(carsAtTheParikng);
    }

    private static void washCars(Car[] cars) {
        for (Car c : cars){
            c.wash();
        }
    }


}
