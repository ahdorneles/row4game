package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 24/01/17.
 */
public class Main {
    public static void main(String[] args) {
        int numPlayers = 50;

        Player[] players = new Player[numPlayers];

        for( int i = 0; i < players.length; i ++ ){
            players[i] = new Player("Player" + (i+1));
        }

        Game game = new Game();

        game.play(players, 0, 1000);

    }
}
