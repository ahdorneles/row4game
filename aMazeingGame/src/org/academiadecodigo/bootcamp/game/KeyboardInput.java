package org.academiadecodigo.bootcamp.game;

import org.academiadecodigo.bootcamp.gameObject.*;
import org.academiadecodigo.bootcamp.grid.GridDirection;
import org.academiadecodigo.bootcamp.grid.Level;
import org.academiadecodigo.bootcamp.grid.SimpleGfxGrid;
import org.academiadecodigo.bootcamp.grid.position.SimpleGfxGridPosition;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by codecadet on 11/02/2017.
 */
public class KeyboardInput implements KeyboardHandler {

    private Keyboard k;
    private SimpleGfxGrid grid;
    private Level currentLevel = Game.currentLevel;
    private Credits credits;
    private SimpleGfxGridPosition simpleGfxGridPosition;
    private Game game;
    private boolean menuFlag = false;


    public KeyboardInput(SimpleGfxGrid grid) {
        this.grid = grid;
        k = new Keyboard((KeyboardHandler) this);
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


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        this.simpleGfxGridPosition = new SimpleGfxGridPosition(800, 600, grid);
        this.game = new Game(1000);
        if (keyboardEvent.getKey() == keyboardEvent.KEY_Q) {
            credits = new Credits(simpleGfxGridPosition);
            grid.getObjectList().clear();

            /*Iterator<GameObject> it = grid.getObjectList().iterator();
            while (it.hasNext()) {
                it.next().getRectangle().delete();
                it.remove();
                it.next();*/
        }
        if (keyboardEvent.getKey() == keyboardEvent.KEY_SPACE) {
            if (!menuFlag) {
                Iterator<GameObject> it = grid.getObjectList().iterator();
                while (it.hasNext()) {
                    GameObject menuPic = it.next();
                    if (menuPic instanceof Menu) {
                        Menu menu = (Menu) menuPic;
                        ((Menu) menu).getPicture().delete();
                    }
                    it.remove();
                }
                currentLevel.getLevel();
                grid.init(game.nextLevel(Level.MENU));
                currentLevel = Level.values()[Level.MENU.ordinal() + 1];
                menuFlag = true;
            }
        }

        if(keyboardEvent.getKey() == KeyboardEvent.KEY_R) {

            System.out.println("---------------------------> RESET");
            ArrayList<GameObject> backupList = new ArrayList<>();
            Iterator<GameObject> it = grid.getObjectList().iterator();

            while (it.hasNext()) {
                GameObject a = it.next();
                System.out.println("b4 delete ---------------------");
                if(a instanceof Wall) {
                    ((Wall) a).getPicture().delete(); }
                    if( a instanceof FinishLine || a instanceof Avatar) {
                    a.getRectangle().delete();
                }
                it.remove();

                System.out.println(grid.getObjectList().size());
            }

            grid.getObjectList().clear();
            System.out.println("first list " + grid.getObjectList());
            System.out.println(backupList);
            grid.init(Game.currentLevel.getLevel());



        }

        for (GameObject avatar1 : grid.getObjectList()) {
            if (avatar1 instanceof Avatar) {

                System.out.println("2nd list verification " + grid.getObjectList());

                Avatar avatar = (Avatar) avatar1;

                System.out.println("Posição do avatar" + ((Avatar) avatar).getPos());
                System.out.println("List size " + grid.getObjectList().size());


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
}
