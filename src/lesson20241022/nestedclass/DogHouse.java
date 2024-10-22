package lesson20241022.nestedclass;

import java.util.List;

import static lesson20241022.nestedclass.Dog.DogFood;

public class DogHouse {

    public static void main(String[] args) {
        Dog dog = new Dog("Dog");

        Dog.DogFood bone = new Dog.DogFood("bone");
        DogFood mouse = new Dog.DogFood("mouse");
        List<DogFood> foodList = List.of(bone, mouse);
        dog.setFoodList(foodList);

        System.out.println(dog);



    }


}
