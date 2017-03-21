package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 24/01/17.
 */
public class Game {
    Game

    public Game() {

    }

    private int gRNG(int min, int max) {
        return RandomGeneratot.random(min, max);
    }

    public void play(Player[] players, int min, int max) {

        int cNumber = gRNG(min, max);

        boolean winner = false;

        System.out.println(cNumber + " was chosen by the computer");

        while (!winner) {
            System.out.println("A new round is goinf to start!!");

            for (Player p : players) {

                int playerNumber = p.pickNumber(min, max);

                System.out.println("Player " + p.getName() + " choose the number " + playerNumber );

                if (playerNumber == cNumber) {
                    System.out.println("O jogador " + p.getName() + " choose the right number " + cNumber );
                    winner = true;
                    break;
                }


            }

        }

    }

}
