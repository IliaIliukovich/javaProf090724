package summary20241122;

import java.util.Optional;

public class FlatmapWithOptional {

    public static void main(String[] args) {
        Optional<Optional<String>> optionalOfOptional = Optional.of(Optional.of("Data"));
        Optional<String> optional = optionalOfOptional.flatMap(s -> s);
        System.out.println(optional.get());
        Optional<Integer> integerOptional = optional.map(s -> s.length());
        System.out.println(integerOptional.get());

        Insurance insurance = new Insurance("Insurance data");
        Car car = new Car(insurance);

//        String info = car.getInsurance().get().getInfo().get();
//        Optional<Optional<String>> optional1 = car.getInsurance().map(Insurance::getInfo);
        String info = car.getInsurance().flatMap(Insurance::getInfo).orElse("No insurance info present");
        System.out.println(info);

        Insurance insurance2 = new Insurance();
        Car car2 = new Car(insurance2);
        info = car2.getInsurance().flatMap(Insurance::getInfo).orElse("No insurance info present");
        System.out.println(info);
    }


    static class Car {

        private Optional<Insurance> insurance;

        public Car() {
            this.insurance = Optional.empty();
        }

        public Car(Insurance insurance) {
            this.insurance = Optional.of(insurance);
        }

        public Optional<Insurance> getInsurance() {
            return insurance;
        }
    }

    static class Insurance {
        private Optional<String> info;

        public Insurance() {
            this.info = Optional.empty();
        }

        public Insurance(String info) {
            this.info = Optional.of(info);
        }

        public Optional<String> getInfo() {
            return info;
        }
    }



}
