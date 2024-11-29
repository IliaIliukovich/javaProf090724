package summary20241129;

import java.util.List;

public class WildCardsExamples {

    public static void main(String[] args) {
        new Box<Integer>(10);
        new Box<Float>(10.0f);
//        new Box<String>("string"); // impossible


        // PECS rule: Producer extends Consumer super
        List<Tesla> teslaList = List.of(new Tesla(), new Tesla());
        List<Car> carList = List.of(new Car(), new BMW());

        // Producer extends
        List<? extends Car> link1 = carList;
        link1 = teslaList;

        Car car = link1.get(0);
//        link1.add(new BMW());
//        link1.add(new Car());

        // Consumer super
        List<? super Tesla> link2 = teslaList;
        link2 = carList;

//        Object object = link2.get(0); // bag solution
//        link2.add(new Car()); // impossible
        link2.add(new Tesla());
        link2.add(new TeslaVersion());

        process(teslaList);
        process(carList);

//        process2(teslaList); // impossible
        process2(carList);
    }

    static void process(List<? extends Car> list) { // list as producer
        Car car = list.get(0);
        // some code
    }

    static void process2(List<? super Car> list) { // list as consumer
        list.add(new Car());
        list.add(new BMW());
        // some code
    }



    static class Box <Item extends Number> {

        private Item item;

        public Box(Item item) {
            this.item = item;
        }
    }




}
