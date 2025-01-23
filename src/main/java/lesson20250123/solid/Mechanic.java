package lesson20250123.solid;

public class Mechanic {

    public void service(Car car) {
        commonService(car);
        specialService(car);
        washingService(car);
    }

    private static void commonService(Car car) {
        System.out.println("Common service for" + car);
    }

    private static void specialService(Car car) {
        car.getCarService().service();
//        if (car instanceof Tesla) {
//            System.out.println("Special service for Tesla");
//        } else if (car instanceof BMW) {
//            System.out.println("Special service for BMW");
//        } else {
//            System.out.println("Unknown car type! I cannot service it!");
//        }
    }

    private static void washingService(Car car) {
        System.out.println("Washing service for" + car);
    }

    public static void main(String[] args) {
        Mechanic mechanic = new Mechanic();
        Car car1 = new BMW();
        Car car2 = new Tesla();

        mechanic.service(car1);
        mechanic.service(car2);

        Car car3 = new TelsaModification();
        mechanic.service(car3); // Liskov substitution principle violation
    }


}
