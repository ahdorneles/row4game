package org.academiadecodigo.bootcamp.game;

import org.academiadecodigo.bootcamp.Player;
import org.academiadecodigo.bootcamp.gameObject.Avatar;
import org.academiadecodigo.bootcamp.gameObject.FinishLine;
import org.academiadecodigo.bootcamp.gameObject.GameObject;
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


    public Game(int delay) {/// not sure if needs it
        this.delay = delay;
        this.objectList = null;
    }

    public void init() {

        grid = new SimpleGfxGrid(20, 20);
        Rectangle rectangle = new Rectangle(grid.getPADDING(), grid.getPADDING(), grid.getCELL_SIZE() * grid.getCols(), grid.getCELL_SIZE() * grid.getRows());
        rectangle.setColor(Color.BLUE);
        rectangle.draw();

        grid.init(Level.LEVEL_1.getLevel());
        KeyboardInput keyboardInput = new KeyboardInput(grid);
        objectList = grid.getObjectList();



    }

    public void start() {

        while (runningGame) {
            try {
                java.lang.Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (levelComplete()) {
                for (GameObject o: grid.getObjectList()) {
                    o.getRectangle().delete();
                }
                //objectList.clear();
                //objectList = grid.init(nextLevel(currentLevel));

                grid.init(nextLevel(currentLevel));

                currentLevel = Level.values()[currentLevel.ordinal() + 1];

            }
        }
    }

    private int[][] nextLevel(Level currentLevel) {
        return Level.values()[currentLevel.ordinal() + 1].getLevel();
    }

    private boolean levelComplete() {
        System.out.println("Checking level complete");

        int totalChecks = 0;
        int positiveChecks = 0;

        System.out.println(grid.getObjectList().size());

        for (GameObject a : grid.getObjectList()) {
            //System.out.println(a);

            if (a instanceof Avatar) {
                System.out.println("positive checks");
                Avatar avatar = (Avatar) a;
                totalChecks++;
                System.out.println(totalChecks + " total");
                positiveChecks += confirmation(avatar);
            }

            if (totalChecks != 0 && totalChecks == positiveChecks) {
                return true;
            }

        }
        return false;
    }

    private int confirmation(Avatar a) {
        System.out.println("first conf");
        for (GameObject f : grid.getObjectList()) {
            if (f instanceof FinishLine) {
                FinishLine line = (FinishLine) f;
                System.out.println("pre confirm");
                if (a.getPos().compare(line.getPos())) {
                    System.out.println("confirm 1");
                    return 1;
                }
            }

        }
        return 0;
    }


}

