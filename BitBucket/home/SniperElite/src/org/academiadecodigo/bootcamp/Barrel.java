package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 01/02/17.
 */
public class Barrel extends GameObject implements Destroyable {
    @Override
    public String toString() {
        return "Barrel";
    }

    private boolean isDestroyed;
    private BarrelType barrelType;
    private int currentDamage;

    public String getMessage() {
        return "Barrel";
    }

    public Barrel() {
        int rand = (int) (Math.random() * (4 -1)) + 1;
        // this.maxDamage = barrelType.getMaxDamage();
        // this.isDestroyed = false;
        if (rand == 1) {
            this.barrelType = BarrelType.METAL;
        }
        if (rand == 2) {
            this.barrelType = BarrelType.PLASTIC;
        }
        if (rand == 3) {
            this.barrelType = BarrelType.WOOD;
        }
    }


    public boolean isDestroyed() {
        return isDestroyed;
    }

    public void destroyed() {
         isDestroyed = true;
    }

    public BarrelType getBarrelType(){
        return barrelType;
    }


    public void hit(int damage) {
        currentDamage = currentDamage + damage;
        System.out.println("Barrel type: " + getBarrelType());
        System.out.println("Max Damage: " +  (barrelType.getMaxDamage() - currentDamage));
        System.out.println("Damage done: " + currentDamage );
        if (currentDamage >= barrelType.getMaxDamage()) {
            System.out.println("Barrel exploded!!");
            destroyed();
        }

    }

}
