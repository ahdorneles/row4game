package org.academiadecodigo.bootcamp.game;

import org.academiadecodigo.bootcamp.player.Player;
import org.academiadecodigo.bootcamp.util.Suit;
import sun.plugin.dom.exception.InvalidStateException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codecadet on 10/02/17.
 */
public class Game {
    private Player[] players;
    private  Deck deck;
    private Suit trunf;
    private Suit beingPlayer;


    public void init(Player[] players, Deck deck) {
        this.players = players;
        this.deck = deck;

        initPlayers();
    }

    private void initPlayers() {
        for (Player p : players) {
            p.setGame(this);
        }
    }

    public void start() {
        if(players.length != 4){
            throw new InvalidStateException("Beed to have 4 players");
        }
       if (deck == null){
           throw new InvalidStateException("No cards");
       }

        deck.shuffle();
        chooseTrunf();
        drawCards();
        play();
    }

    private void play() {
        int rounds = players[0].sizeOfHand();
        for (int i = 0; i <  rounds ; i++) {
            playRounds();
            System.out.println("Round :" + (i +1));
        }

        printClasssification();

    }

    private void playRounds() {
        ArrayList<Card> table = new ArrayList<>():

        for (Player p: players) {
            table.add(p.play());
        }
        findWinner(table);

        beingPlayer = null;
    }

    private void drawCards() {
        for (Player p : players) {

            List<Card> playerHand = new ArrayList<>();

            for (int i = 0; i < 10 ; i++) {
                playerHand.add(deck.removeCard());
            }

            p.addCards(playerHand);
        }
    }

    private void chooseTrunf() {
        trunf = deck.peek();
    }

    public Suit getBeingPlayed() {
        return beingPlayer;
    }

    public void setBeingPlayed(Suit beingPlayed) {
        this.beingPlayed = beingPlayed;
    }
}
