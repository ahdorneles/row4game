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
public class Game implements KeyboardHandler {

    private int delay;
    private SimpleGfxGrid grid;
    private boolean runningGame = true;
    private Keyboard k;
    private ArrayList<GameObject> objectList;


    public Game(int delay) {/// not sure if needs it
        this.delay = delay;
        this.objectList = null;
    }

    public void init() {

        grid = new SimpleGfxGrid(20, 20);
        Rectangle rectangle = new Rectangle(grid.getPADDING(), grid.getPADDING(), grid.getCELL_SIZE() * grid.getCols(), grid.getCELL_SIZE() * grid.getRows());
        rectangle.setColor(Color.BLUE);
        rectangle.draw();
/*        CollisionDetector collisionDetector = new CollisionDetector();*/
        //GameObject[] gameObjects = new GameObject[];

        grid.init(Level.LEVEL_1.getLevel());
        objectList = grid.getObjectList();


    }

    public void start() {

        while (runningGame) {
            try {
                java.lang.Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Level currentLevel = Level.LEVEL_1;

            if (levelComplete()) {
                for (GameObject o: objectList) {
                    o.getRectangle().delete();
                }
                objectList.clear();

                System.out.println("---------------------> IS THIS EMPTY? " + objectList.size());

                grid.init(nextLevel(currentLevel));

                currentLevel = Level.values()[currentLevel.ordinal() + 1];

            }
        }
    }

    private int[][] nextLevel(Level currentLevel) {
        return Level.values()[currentLevel.ordinal() + 1].getLevel();
    }

    private boolean levelComplete() {
        System.out.println("lvlcomp");

        int totalChecks = 0;

        int positiveChecks = 0;

        for (GameObject a : objectList) {
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
        for (GameObject f : objectList) {
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

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

  /*  public void moveAvatar() {

        if (!collider.collided()) {

        }*/

}

