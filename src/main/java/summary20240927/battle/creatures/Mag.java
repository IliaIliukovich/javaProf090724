package summary20240927.battle.creatures;

import summary20240927.battle.skills.HealingSkills;
import summary20240927.battle.skills.ReinforcementSkills;

public class Mag extends Character implements HealingSkills, ReinforcementSkills {

    private int force;
    private int protection;
    private int level;

    public Mag(String name, int force, int protection, int level) {
        super(name);
        this.force = force;
        this.protection = protection;
        this.level = level;
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
    public void heal(Character character) {
        if (character.getHealth() < 100) {
            character.setHealth(100);
            System.out.println(character.getName() + " was healed by mag " + this.getName());
        }
    }

    @Override
    public void heal(Character[] characters) {
        for (Character character : characters){
            heal(character);
        }
    }

    @Override
    public void increaseForce(Superhero hero) {
        hero.setForce((int) (hero.getForce() * (1 + 0.1 * level)));
        System.out.println(hero.getName() + " was inspired by mag " + getName());
    }

    @Override
    public void increaseForce(Superhero[] heroes) {
        for (Superhero superhero : heroes){
            increaseForce(superhero);
        }
    }
}
