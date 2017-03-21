package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 22/01/17.
 */
public class Game {
    private String gameName;
    private int gameNumber;


    public Game() {
        this.gameName = "Let's guess the number ";
    }


    public String getGameName() {
        return gameName;
    }

    private int pcNumber(int gameMinNum, int gameMaxNum) {
        return gameNumber = (int) (Math.random() * ((gameMaxNum + 1) - gameMinNum) + gameMinNum);
    }

    public int getGameNumber() {
        return gameNumber;
    }

    public void startGame(Player[] players, int gameMin, int gameMax) {

        boolean hasPlayerGuessed = true;
        pcNumber(gameMin, gameMax);
        System.out.println(getGameName() + getGameNumber());

        while (hasPlayerGuessed) {
            for (int i = 0; i < players.length; i++) {
                int rPlayer = players[i].guess(gameMin, gameMax);

                if (rPlayer != getGameNumber()) {
                    System.out.println("The new guess of " + players[i].getName() + " is: " + rPlayer);
                    System.out.println("The number doesn't match " + players[i].getName());
                }

                if (rPlayer == getGameNumber()) {
                    System.out.println("The new guess of " + players[i].getName() + " is: " + rPlayer);
                    System.out.println(" The Numbers match");
                    return;
                }
            }
        }
    }


}
