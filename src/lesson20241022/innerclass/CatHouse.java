package lesson20241022.innerclass;

public class CatHouse {

    public static void main(String[] args) {
        Cat cat = new Cat("Cat");
        Cat.Kitten kitten1 = cat.new Kitten("Kitten1");
        Cat.Kitten kitten2 = cat.new Kitten("Kitten2");

        Cat cat2 = new Cat("Cat2");
        Cat.Kitten kitten3 = cat2.new Kitten("Kitten3");

        System.out.println(cat);
        System.out.println(cat2);

        System.out.println(kitten1);
        System.out.println(kitten2);
        System.out.println(kitten3);

        cat.setKitten(kitten3);
        System.out.println(cat);
    }


}
