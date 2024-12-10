package lesson20241001;

public class TypeCheck {

    public static void main(String[] args) {
        Object cat1 = new Cat("Cat", 1);
        Object cat2 = new Cat("Cat", 1);
        Object cat3 = new BlackCat("Cat", 1);

        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.equals(cat3)); // false
        System.out.println(cat3.equals(cat1)); // false

        // getClass()
        System.out.println(cat1.getClass());
        System.out.println(cat2.getClass());
        System.out.println(cat3.getClass());

        // instanceof
        System.out.println(cat1 instanceof Object);
        System.out.println(cat1 instanceof Cat);
        System.out.println(cat1 instanceof BlackCat);

        System.out.println(cat3 instanceof Object);
        System.out.println(cat3 instanceof Cat);
        System.out.println(cat3 instanceof BlackCat);

        // equals() requierments
        // a.equals(a) true
        // a.equals(b) <---> b.equals(a)
        // a.equals(b), b.equals(c) ----> a.equals(c)
    }


}
