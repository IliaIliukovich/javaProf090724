package summary20240927.battle.gameevents;

import summary20240927.battle.creatures.EvilCreature;
import summary20240927.battle.creatures.Mag;
import summary20240927.battle.creatures.Superhero;
import summary20240927.battle.items.Protection;
import summary20240927.battle.items.Weapon;

public class SuperheroBattle {

    // Main logic of the battle game
    public static void main(String[] args) {
        Weapon sword = new Weapon("Sword", 12);
        Protection armour = new Protection("Armour", 3);
        Superhero spiderman = new Superhero("Spiderman", 10, sword, armour);

        EvilCreature zombie = new EvilCreature("Zombie", 15, 1, false);

        spiderman.introduce();
        zombie.introduce();

        System.out.println("---Round 1---");
        spiderman.fight(zombie); // method on the object call
//        zombie.fight(spiderman);
//        Util.fight(spiderman, zombie); // static method in Util class

        System.out.println("After fight:");
        System.out.println(spiderman);
        System.out.println(zombie);

        System.out.println("---Round 2---");
        zombie.setAngry(true);
        spiderman.fight(zombie);
        System.out.println("After fight:");
        System.out.println(spiderman);
        System.out.println(zombie);

        System.out.println("---Mag in action---");
        Mag mag = new Mag("Wizard", 15, 1, 2);
        mag.heal(spiderman);
        mag.increaseForce(spiderman);

        System.out.println("---Round 3---");
        EvilCreature randomEvilCreature = EvilCreature.generateRandomEvilCreature();
        spiderman.fight(randomEvilCreature);
        System.out.println("After fight:");
        System.out.println(spiderman);
        System.out.println(randomEvilCreature);
    }


}
