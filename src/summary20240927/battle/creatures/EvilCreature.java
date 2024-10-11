package summary20240927.battle.creatures;

public final class EvilCreature extends Character {

    private int force;

    private int protection;

    public EvilCreature(String name, int force, int protection) {
        super(name);
        this.force = force;
        this.protection = protection;
    }

    @Override
    public int countForce() {
        return force;
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
                ", protection=" + protection;
    }

//    @Override
//    public void fight(Character another) {
//        System.out.println("Custom logic for evil creature");
//    }
}
