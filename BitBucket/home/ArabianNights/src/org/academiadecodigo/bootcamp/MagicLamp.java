package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 26/01/17.
 */
public class MagicLamp {
    private Genie[] genies;
    private Genie genie;
    private String name;
    private int numberOfGenies;
    private int rubCounter;
    private int numberOfWishes;
    private Demon demon;

    public MagicLamp(String name, int numberOfGenies, int numberOfWishes) {
        this.name = name;
        this.numberOfGenies = numberOfGenies;
        this.numberOfWishes = numberOfWishes;


    }


    public Genie rubLamp() {
        rubCounter ++;
        if(numberOfGenies >= rubCounter) {
            if (rubCounter % 2 == 0 && rubCounter != numberOfGenies) {
                return new Happy(numberOfWishes);
            }
           else if (rubCounter % 2 != 0 && rubCounter != numberOfGenies) {
                return new Grumpy(numberOfWishes);
            }
           else if (rubCounter == numberOfGenies) {
                return new Demon(numberOfWishes);
            }
        }
        System.out.println("No more rubbs available!!");
        return null;
    }

    public boolean lampRecycle(){
        if(demon.demonRecharge()){
            System.out.println("Lamp has been reseted");
            rubCounter = 0;
            return true;
        }
        return false;
    }
}
