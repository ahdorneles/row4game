package org.academiadecodigo.bootcamp.game;

import org.academiadecodigo.bootcamp.Player;
import org.academiadecodigo.bootcamp.gameObject.Avatar;
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
    private Avatar avatar;
    private CollisionDetector collider;
    private boolean runningGame = true;
    private Level level;
    private Keyboard k;
    private ArrayList <GameObject> objectList;


    public Game(int delay) {/// not sure if needs it
        this.delay = delay;
        this.objectList = null;
    }

    public void init() {

        grid = new SimpleGfxGrid(20, 20);
        Rectangle rectangle = new Rectangle(grid.getPADDING(), grid.getPADDING(), grid.getCELL_SIZE() * grid.getCols(), grid.getCELL_SIZE() * grid.getRows());
        rectangle.setColor(Color.BLUE);
        rectangle.draw();

        CollisionDetector collisionDetector = new CollisionDetector();
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

        while (runningGame == true) {
            java.lang.Thread.sleep(delay);

          /*  moveAvatar();*/
        }

    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {


        for (GameObject avatar : objectList) {
            if (avatar instanceof Avatar) {

                System.out.println("Posição do avatar" + ((Avatar) avatar).getPos());
                System.out.println("List size " + objectList.size());
                System.out.println("List " + objectList.get(11));

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

