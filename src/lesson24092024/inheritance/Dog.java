package lesson24092024.inheritance;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    public void gav() {
        System.out.println("Gav! Gav!");
    }

    @Override
    public void introduce() {
        gav();
        super.introduce();
    }

}
