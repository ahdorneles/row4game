package org.academiadecodigo.bootcamp.game;

import org.academiadecodigo.bootcamp.util.CardType;
import org.academiadecodigo.bootcamp.util.Suit;

/**
 * Created by codecadet on 10/02/17.
 */
public class Card {

    private  Suit suit;
    private  CardType cardType;

    public  Card(Suit suit, CardType cardType){
        this.suit = suit;
        this.cardType = cardType;
    }

    public Suit getSuit() {
        return suit;
    }
}
