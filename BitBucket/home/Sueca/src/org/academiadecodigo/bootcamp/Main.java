package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.game.Deck;
import org.academiadecodigo.bootcamp.game.Game;
import org.academiadecodigo.bootcamp.player.Player;

/**
 * Created by codecadet on 10/02/17.
 */
public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        Player[] players = new Player[4];

        for (int i = 0; i < players.length ; i++) {
            players[i] = new Player("Player" + (i+1));

        }

        Deck deck = new Deck();


        game.init(players, deck);

        game.start();


    }
}
