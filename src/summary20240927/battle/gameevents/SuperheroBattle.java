package summary20240927.battle.gameevents;

import summary20240927.battle.creatures.EvilCreature;
import summary20240927.battle.creatures.Superhero;
import summary20240927.battle.items.Protection;
import summary20240927.battle.items.Weapon;

public class SuperheroBattle {

    // Main logic of the battle game
    public static void main(String[] args) {
        Weapon sword = new Weapon("Sword", 15);
        Protection armour = new Protection("Armour", 4);
        Superhero spiderman = new Superhero("Spiderman", 2, sword, armour);

        EvilCreature zombie = new EvilCreature("Zombie", 5, 1);

        spiderman.introduce();
        zombie.introduce();

        spiderman.fight(zombie); // method on the object call
//        zombie.fight(spiderman);
//        Util.fight(spiderman, zombie); // static method in Util class

        System.out.println("After fight:");
        System.out.println(spiderman);
        System.out.println(zombie);
    }


}
