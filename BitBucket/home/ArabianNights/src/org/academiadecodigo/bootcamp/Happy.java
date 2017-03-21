package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 26/01/17.
 */
public class Happy extends Genie {

    public Happy(int numberOfWishes) {
        super(numberOfWishes);
    }
    @Override
    public  boolean grantWish(){
        if(super.getWishCounter() < super.getWishes()){
            System.out.println("Wish about to be granted by Happy!!");
            super.grantWish();
            return true;
        }
        System.out.println("Wish not granted by Happy!!");
        return false;
    }



}
