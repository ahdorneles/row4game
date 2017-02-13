package org.academiadecodigo.bootcamp.game;

import org.academiadecodigo.bootcamp.Player;
import org.academiadecodigo.bootcamp.gameObject.*;
import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.grid.GridDirection;
import org.academiadecodigo.bootcamp.grid.Level;
import org.academiadecodigo.bootcamp.grid.SimpleGfxGrid;
import org.academiadecodigo.bootcamp.grid.position.SimpleGfxGridPosition;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import sun.jvm.hotspot.runtime.Thread;

import java.util.*;

/**
 * Created by codecadet on 06/02/2017.
 */
public class Game {

    private int delay;
    private SimpleGfxGrid grid;
    private boolean runningGame = true;
    private ArrayList<GameObject> objectList;
    public static Level currentLevel = Level.LEVEL_1;
    private Picture picture;
    private Music music;


    public Game(int delay) {
        this.delay = delay;
        this.objectList = null;
    }

    public void init() {
        grid = new SimpleGfxGrid(20, 20);
        grid.init(Level.MENU.getLevel());
        KeyboardInput keyboardInput = new KeyboardInput(grid);
        objectList = grid.getObjectList();
    }

    public void start() {
        this.music = new Music();
        music.startMusic();


        while (runningGame) {
            try {
                java.lang.Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (levelComplete()) {
                for (GameObject o : grid.getObjectList()) {
                    o.getPicture().delete();
                }

                grid.init(nextLevel(currentLevel));

                currentLevel = Level.values()[currentLevel.ordinal() + 1];

            }
        }
    }

    public int[][] nextLevel(Level currentLevel) {
        return Level.values()[currentLevel.ordinal() + 1].getLevel();
    }

    private boolean levelComplete() {

        int totalChecks = 0;
        int positiveChecks = 0;

        for (GameObject a : grid.getObjectList()) {

            if (a instanceof Avatar) {
                Avatar avatar = (Avatar) a;
                totalChecks++;
                positiveChecks += confirmation(avatar);
            }

        }
        if (totalChecks != 0 && totalChecks == positiveChecks) {
            return true;
        }
        return false;
    }

    private int confirmation(Avatar a) {
        for (GameObject f : grid.getObjectList()) {
            if (f instanceof FinishLine) {
                FinishLine line = (FinishLine) f;
                if (a.getPos().compare(line.getPos())) {
                    return 1;
                }
            }
        }
        return 0;
    }
}

