package org.academiadecodigo.bootcamp.player;

import org.academiadecodigo.bootcamp.game.Card;
import org.academiadecodigo.bootcamp.game.Game;
import org.academiadecodigo.bootcamp.util.AMG;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by codecadet on 10/02/17.
 */
public class Player {
    private String name;
    private List<Card> hand;
    private Game game;

    public Player(String name) {
        this.name = name;
        hand = new LinkedList<>();
    }

    public void setGame(Game game) {
    }

    public void addCards(List<Card> hand) {
        this.hand.addAll(hand);
    }

    public int sizeOfHand() {
        return hand.size();
    }

    public Card play() {
        if(checkSuit()){
            return sameSuitCard();
        }
        else{
            return randomCard();
        }
    }

    private Card randomCard() {
        Card card = hand.remove(AMG.random(hand.size()));

        if( game.getBeingPlayed() == null){
            System.out.println(name + " set the suit " + card.getSuit());
            game.setBeingPlayed(card.getSuit());
        }
        System.out.println(name + " " + card);
        return card;
    }

    private Card sameSuitCard() {
        System.out.println("Same suit card");
        Card card = hand.get(AMG.random(hand.size()));


        while (card.getSuit() != game.getBeingPlayed()){
            card = hand.get(AMG.random(hand.size()));
        }
        hand.remove(card);
        return card;
    }

    private boolean checkSuit() {

        if(game.getBeingPlayed() == null){
            return false;
        }
        for (Card c: hand) {
            if(c.getSuit().equals(game.getBeingPlayed())){
                return true;
            }
        }
        return false;
    }
}
