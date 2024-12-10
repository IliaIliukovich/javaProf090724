package lesson20241022.methodlocalclass;

import java.util.List;

public class ProcessData {

    public void process(List<Integer> input) {

        String localVariable = "local value"; // must be effectively final
//        localVariable = "new value";

        class Rectangle {
            int x;
            int y;

            public Rectangle(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public int calculateSquare() {
                System.out.println(localVariable);
                return x * y;
            }

        }

        Rectangle rectangle1 = new Rectangle(input.get(0), input.get(1));
        int square1 = rectangle1.calculateSquare();
        Rectangle rectangle2 = new Rectangle(input.get(2), input.get(3));
        int square2 = rectangle2.calculateSquare();

        System.out.println("Total square of figures: " + (square1 + square2));
    }


    public static void main(String[] args) {
        ProcessData processData = new ProcessData();
        List<Integer> data = List.of(2, 2, 3, 4);
        processData.process(data);

//        Rectangle rectangle = new Rectangle(1, 2); // impossible
    }



}
