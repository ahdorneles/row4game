package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 24/01/17.
 */
public class Main {
    public static void main(String[] args) {
        Player player1 = new Player(" FRED ");
        Player player2 = new Player(" ALEX ");



        Game game1 = new Game();

        game1.startGame(3, player1, player2 );

    }


}