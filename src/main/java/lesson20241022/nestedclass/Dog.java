package lesson20241022.nestedclass;

import java.util.List;

public class Dog {

    private String name;

    private List<DogFood> foodList;

    public Dog(String name) {
        this.name = name;
    }

    public void setFoodList(List<DogFood> foodList) {
        this.foodList = foodList;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", foodList=" + foodList +
                '}';
    }

    public static class DogFood {
        private String foodName;

        public DogFood(String foodName) {
            this.foodName = foodName;
        }

        public void print() {
//            System.out.println(name); // impossible
        }

        @Override
        public String toString() {
            return "DogFood{" +
                    "foodName='" + foodName + '\'' +
                    '}';
        }
    }


}
