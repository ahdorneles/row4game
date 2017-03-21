package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 24/01/17.
 */
public class Player {
    private String name;
    private int score = 0;


    public Player(String name) {
        this.name = name;
    }

    public RPS pChoice(){
        int choice = (int) (Math.random() * (RPS.values().length));

        return RPS.values()[choice];
    }
    public String getName(){
        return name;
    }

    public int scoreCounter(){
        return  score++;
    }

}