package summary20240927.battle.creatures;

import java.util.Random;

public final class EvilCreature extends Character {

    private int force;

    private int protection;

    private boolean isAngry;

    public EvilCreature(String name, int force, int protection, boolean isAngry) {
        super(name);
        this.force = force;
        this.protection = protection;
        this.isAngry = isAngry;
    }

    @Override
    public int countForce() {
        return isAngry ? force * 2 : force;
    }

    @Override
    public int countProtection() {
        return protection;
    }

    @Override
    public String toString() {
        return "EvilCreature='" + getName() + '\'' +
                ", health=" + getHealth() +
                ", force=" + force +
                ", protection=" + protection +
                ", isAngry=" + isAngry;
    }

    public void setAngry(boolean angry) {
        isAngry = angry;
    }

    public static EvilCreature generateRandomEvilCreature() {
        Random random = new Random();
        String[] names = {"Wolf", "Joker", "Ghost"};
        return new EvilCreature(names[random.nextInt(names.length)], random.nextInt(10), 1 + random.nextInt(3), false);
    }

}
