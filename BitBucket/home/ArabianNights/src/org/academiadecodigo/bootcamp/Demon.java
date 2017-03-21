package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 26/01/17.
 */
public class Demon extends Genie {
    private boolean hasRecharged;


    public Demon(int numberOfWishes) {
        super(numberOfWishes);
    }

    @Override
    public  boolean grantWish(){
        if(hasRecharged == false){
            System.out.println("Wish about to be granted by Demon!!");
            super.grantWish();
            return true;
        }
        System.out.println("Wish not granted by Demon!!");
        return false;
    }

    public boolean demonRecharge(){
        if(hasRecharged == false){
            hasRecharged = true;
            return true;
        }
        System.out.println("No more recharges!!");
        return false;
    }

    public boolean getRecharged(){
        return hasRecharged;
    }


}
