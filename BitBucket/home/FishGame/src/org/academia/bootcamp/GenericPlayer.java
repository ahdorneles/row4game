package org.academia.bootcamp;

import javax.smartcardio.Card;
import java.util.ArrayList;

/**
 * Created by codecadet on 17/02/17.
 */
public class GenericPlayer {
    private String name;
    private ArrayList<Card> hand;
    private int fishes;
    private Game game;

    public GenericPlayer(String name){
        this.name = name;
    }

    public void init(){

    }

}
