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

        k = new Keyboard(this);
        KeyboardEvent up = new KeyboardEvent();
        KeyboardEvent down = new KeyboardEvent();
        KeyboardEvent left = new KeyboardEvent();
        KeyboardEvent right = new KeyboardEvent();
        KeyboardEvent reset = new KeyboardEvent();
        KeyboardEvent start = new KeyboardEvent();
        KeyboardEvent quit = new KeyboardEvent();

        up.setKey(KeyboardEvent.KEY_UP);
        down.setKey(KeyboardEvent.KEY_DOWN);
        left.setKey(KeyboardEvent.KEY_LEFT);
        right.setKey(KeyboardEvent.KEY_RIGHT);
        reset.setKey(KeyboardEvent.KEY_R);
        start.setKey(KeyboardEvent.KEY_SPACE);
        quit.setKey(KeyboardEvent.KEY_Q);

        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        reset.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        start.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        quit.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        k.addEventListener(up);
        k.addEventListener(down);
        k.addEventListener(left);
        k.addEventListener(right);
        k.addEventListener(reset);
        k.addEventListener(start);
        k.addEventListener(quit);


    }

    public void start() throws InterruptedException {

        while (runningGame) {
            java.lang.Thread.sleep(delay);

            Level currentLevel = Level.LEVEL_1;

            if (levelComplete()) {
                objectList.clear();
                grid.init(nextLevel(currentLevel));
                currentLevel = Level.values()[currentLevel.ordinal() + 1];

            }
        }
    }

    private int[][] nextLevel(Level currentLevel) {
        return Level.values()[currentLevel.ordinal() + 1].getLevel();
    }

    private boolean levelComplete() {
        int totalChecks = 0;

        int positiveChecks = 0;

        for (GameObject a : objectList) {
            if (a instanceof Avatar) {
                totalChecks++;
                positiveChecks += confirmation((Avatar) a);

            }
            if (totalChecks == positiveChecks) {
                return true;
            }

        }
        return false;
    }

    private int confirmation(Avatar a) {
        for (GameObject f : objectList) {
            if (f instanceof FinishLine) {
                if (a.getPos().compare(((FinishLine) f).getPos())) {
                    return 1;
                }
            }

        }
        return 0;
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {


        for (GameObject avatar1 : objectList) {
            if (avatar1 instanceof Avatar) {

                Avatar avatar = (Avatar) avatar1;

                System.out.println("Posição do avatar" + ((Avatar) avatar).getPos());
                System.out.println("List size " + objectList.size());


                switch (keyboardEvent.getKey()) {
                    case KeyboardEvent.KEY_UP:
                        avatar.move(GridDirection.UP);
                        break;
                    case KeyboardEvent.KEY_DOWN:
                        avatar.move(GridDirection.DOWN);
                        break;
                    case KeyboardEvent.KEY_LEFT:
                        avatar.move(GridDirection.LEFT);
                        break;
                    case KeyboardEvent.KEY_RIGHT:
                        avatar.move(GridDirection.RIGHT);
                        break;

                }
            }
        }
    }


    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

  /*  public void moveAvatar() {

        if (!collider.collided()) {

        }*/

}

