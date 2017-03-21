package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 26/01/17.
 */
public class Main {
    public static void main(String[] args) {
        int numberOfGenies = 3
                ;
        int numberOfWishes = 3;
        Genie genie1, genie2, genie3;
        Happy happy;


        MagicLamp lamp1 = new MagicLamp("Lamp", numberOfGenies , numberOfWishes);

        genie1 = lamp1.rubLamp();
        genie2 = lamp1.rubLamp();
        genie3 = lamp1.rubLamp();

        lamp1.rubLamp();

        genie1.grantWish();

        genie1.grantWish();

        genie2.grantWish();

        genie2.grantWish();

        genie2.grantWish();


        genie2.grantWish();

        genie3.grantWish();
        genie3.grantWish();
        genie3.grantWish();
        genie3.grantWish();
        genie3.grantWish();












    }


}

