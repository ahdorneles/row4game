package org.academiadecodigo;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

/**
 * Created by codecadet on 14/02/17.
 */
public class KeyBoardInput implements KeyboardHandler {
    private GridPosition gridPosition;
    public Keyboard k;
    private Cell cell;



    public KeyBoardInput(GridPosition gridPosition) {
        this.gridPosition = gridPosition;
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
        this.cell = new Cell(gridPosition);
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_UP:
                cell.move(GridDirection.UP);
                break;
            case KeyboardEvent.KEY_DOWN:
                cell.move(GridDirection.DOWN);
                break;
            case KeyboardEvent.KEY_LEFT:
                cell.move(GridDirection.LEFT);
                break;
            case KeyboardEvent.KEY_RIGHT:
                cell.move(GridDirection.RIGHT);
                break;

        }

    }





    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
