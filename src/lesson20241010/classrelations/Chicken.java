package lesson20241010.classrelations;

public class Chicken {

    private Egg egg;

//    private static int counter = 0;
//
//    public Chicken() {
//        counter++;
//        System.err.println(counter);
//        this.egg = new Egg();
//    }

    public void setEgg(Egg egg) {
        this.egg = egg;
    }

    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        Egg egg = new Egg();

        chicken.setEgg(egg);
        egg.setChicken(chicken);

        System.out.println(chicken);
        System.out.println(egg);
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "egg=" + egg +
                '}';
    }
}
