package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 31/01/17.
 */
public class ArmouredEnemy extends Enemy {
    @Override
    public String toString() {
        return "Armoured Enemy";
    }

    @Override
    public String getMessage() {
        return "I'am a amrmoured soldier";
    }

    public int armour = 200;
    public int remainingDamage;
    public int armourDamage;
    public int health = 100;



    @Override
    public void hit(int damage) {
        if (armour > 0) {
            armour = armour - damage;
            System.out.println("Armour: " + armour + " Health: " + health);

        }
         if(armour <= 0)  {
            System.out.println("1111Health: " + health);
            health = health - damage;
            if (health <= 0) {
                System.out.println( "Health: " + health  );
                System.out.println("Enemy killed!!");
                super.getDestroyed();
            }
        }
    }


}
