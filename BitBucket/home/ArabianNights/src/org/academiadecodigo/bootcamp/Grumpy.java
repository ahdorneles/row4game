package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 26/01/17.
 */
public class Grumpy extends Genie {

    public Grumpy(int numberOfWishes) {
        super(numberOfWishes);
    }

    @Override
    public  boolean grantWish(){
        if(super.getWishCounter() == 0){
            System.out.println("Wish about to be granted by Grumpy!!");
            super.grantWish();
            return true;
        }
        System.out.println("Wish not granted by Grumpy!!");
        return false;
    }
}
