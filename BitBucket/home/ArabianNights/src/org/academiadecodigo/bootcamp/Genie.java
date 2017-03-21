package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 26/01/17.
 */
public abstract class Genie {

    private int numberOfWishes;
    private int wishCounter;
    private boolean wishGranted;
    private String genie;
    private String name;

        Genie(  int numberOfWishes) {
        this.numberOfWishes = numberOfWishes;

    }


    public String getName() {
        return name;
    }

    public int getWishes() {
        return numberOfWishes;
    }

    public int getWishCounter(){
        return  wishCounter;
    }


    public boolean grantWish(){
        wishCounter ++;
        wishGranted = true;
        System.out.println("A wish was granted!!");
        return wishGranted;
    }



}
