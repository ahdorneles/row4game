package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 31/01/17.
 */
public class Game {
    private String name;
    private int numberOfObjects = 5;
    private GameObject[] objects;
    private SniperRifle sniper;
    private int shootsTaken;


    public Game(String name) {
        this.name = name;
    }


    public void start() {
        createNewObject();

        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
            if (objects[i] instanceof Tree) {
                System.out.println("It's a tree don't shoot");
                continue;
            }
            while (((Destroyable) objects[i]).isDestroyed() == false) {
                shootsTaken++;
            sniper.shoot((Destroyable) objects[i]);
                System.out.println("Shooting " + objects[i] + " Shoot number: " + shootsTaken);

            }
        }
    }

    public GameObject[] createNewObject() {
        sniper = new SniperRifle();
        objects = new GameObject[numberOfObjects];
        for (int i = 0; i < objects.length; i++) {

            if (Math.random() < 0.2) {
                objects[i] = new Tree();
                if(Math.random() > 0.7){
                    objects[i] = new Barrel();
                }
            } else {
                if (Math.random() >= 0.5) {
                    objects[i] = new SoldierEnemy();
                } else {
                    objects[i] = new ArmouredEnemy();
                }

            }

        }
        return objects;
    }


}

