package org.academiadecodigo.bootcamp;

import java.util.Arrays;

/**
 * Created by codecadet on 23/01/17.
 */
public class Main {
    public static void main(String[] args) {
        Game game1 = new Game();
        Player[] playersArray = new Player[2];

        playersArray[0] = new Player("Fred");
        playersArray[1] = new Player("Alex");

        game1.startGame(playersArray, 1,20);
    }
}
