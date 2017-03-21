package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 31/01/17.
 */
abstract public class Enemy extends GameObject implements Destroyable {
    private int health;
    private boolean isDead;
    private boolean isDestroyed = false;

    public Enemy() {
        this.health = 100;
        this.isDead = false;
        this.isDestroyed = false;
    }

    public boolean died() {
        return isDead = true;
    }

    public boolean isDestroyed() {
        return isDestroyed;
    }
    public boolean getDestroyed(){
        return isDestroyed = true;
    }

    public boolean getLife() {
        return isDead;
    }


    public int getHealth() {
        return health;
    }


    public void hit(int damage) {
        health = health - damage;
        System.out.println("Health: " + health);
        if (getHealth() <= 0) {
            System.out.println("Enemy killed!!");
            died();
            getDestroyed();
        }

    }

}
