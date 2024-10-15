package summary20240927.battle.items;

import java.util.Random;

public class Weapon {

    private String name;
    private int force;

    private static Weapon[] availableWeapon;

    static {
        Weapon weapon1 = new Weapon("Sword", 5);
        Weapon weapon2 = new Weapon("Stick", 1);
        availableWeapon = new Weapon[]{weapon1, weapon2};
    }

    public Weapon(String name, int force) {
        this.name = name;
        this.force = force;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", force=" + force +
                '}';
    }

    public static Weapon getRandomWeapon() {
        Random random = new Random();
        int r = random.nextInt(availableWeapon.length);
        return availableWeapon[r];
    }

}
