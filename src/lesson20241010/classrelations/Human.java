package lesson20241010.classrelations;

public class Human {

    private Human friend;

    public void setFriend(Human friend) {
        this.friend = friend;
    }

    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human();

        human1.setFriend(human2);
        human2.setFriend(human1);

        System.out.println(human1);
    }

    @Override
    public String toString() {
        return "Human";
    }
}
