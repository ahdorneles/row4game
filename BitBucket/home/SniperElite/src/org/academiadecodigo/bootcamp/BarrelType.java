package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 01/02/17.
 */
public enum BarrelType {
    PLASTIC(100),
    WOOD(150),
    METAL(200);


    private int maxDamage;

    BarrelType(int maxDamage){
        this.maxDamage = maxDamage;
    }

    public int getMaxDamage(){
        return maxDamage;
    }






}

