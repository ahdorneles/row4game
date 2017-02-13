package org.academiadecodigo.bootcamp;


import org.academiadecodigo.bootcamp.game.Game;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by codecadet on 06/02/2017.
 */
public class Main {
    public static void main(String[] args) {

        Game game = new Game(700);
        game.init();
        game.start();


    }
}
