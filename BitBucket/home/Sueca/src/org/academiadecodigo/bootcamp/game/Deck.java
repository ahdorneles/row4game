package org.academiadecodigo.bootcamp.game;

import jdk.internal.dynalink.linker.LinkerServices;
import org.academiadecodigo.bootcamp.util.CardType;
import org.academiadecodigo.bootcamp.util.Suit;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by codecadet on 10/02/17.
 */
public class Deck {
   private List<Card> cardsInDeck;

    public Deck(){
        cardsInDeck = new LinkedList();

        buildsDeck();

    }

    private void buildsDeck() {
        for (Suit s: Suit.values()) {
            buildsSuitDeck(s);
        }
        System.out.println(cardsInDeck.size());
    }


    private void buildsSuitDeck(Suit suit) {
        for (int i = 0; i < CardType.values().length; i++) {
            cardsInDeck.add(new Card(suit, CardType.values()[i]));

        }
    }

    public void shuffle() {
        Collections.shuffle(cardsInDeck);

    }

    public Suit peek() {
        return cardsInDeck.get(0).getSuit();
    }

    public Card removeCard() {
        Card toReturn = cardsInDeck.get(0);
        cardsInDeck.remove(toReturn);
        return toReturn;
    }
}
