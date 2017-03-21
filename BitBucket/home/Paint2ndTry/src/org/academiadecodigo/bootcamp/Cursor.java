package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

import java.io.IOException;

/**
 * Created by codecadet on 14/02/17.
 */
public class Cursor implements KeyboardHandler {
    private Grid grid;
    private Rectangle cursor;
    private int col;
    private int row;
    private Reader reader;


    public Cursor() {
        start();

    }


    public void init(int col, int row, Grid grid) {
        this.col = col;
        this.row = row;
        this.grid = grid;
        this.cursor = new Rectangle(col + grid.getPadding(), row + grid.getPadding(), grid.getCellSize(), grid.getCellSize());
        cursor.setColor(Color.BLUE);
        cursor.fill();
    }


    public void start() {
        Keyboard k = new Keyboard(this);


        KeyboardEvent up = new KeyboardEvent();
        KeyboardEvent down = new KeyboardEvent();
        KeyboardEvent left = new KeyboardEvent();
        KeyboardEvent right = new KeyboardEvent();
        KeyboardEvent paint = new KeyboardEvent();

        up.setKey(KeyboardEvent.KEY_UP);
        down.setKey(KeyboardEvent.KEY_DOWN);
        left.setKey(KeyboardEvent.KEY_LEFT);
        right.setKey(KeyboardEvent.KEY_RIGHT);
        paint.setKey(KeyboardEvent.KEY_SPACE);

        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        paint.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);


        k.addEventListener(up);
        k.addEventListener(down);
        k.addEventListener(left);
        k.addEventListener(right);
        k.addEventListener(paint);
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        if (keyboardEvent.getKey() == keyboardEvent.KEY_SPACE) {
            grid.getCells()[col][row].paint();
        }

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_UP:
                if (this.row > 0) {
                    cursor.translate(0, -grid.getCellSize());
                    row--;
                }
                break;
            case KeyboardEvent.KEY_DOWN:
                if (this.row < grid.getRow() - 1) {
                    cursor.translate(0, grid.getCellSize());
                    this.row++;
                }
                break;

            case KeyboardEvent.KEY_LEFT:
                if (this.col > 0) {
                    cursor.translate(-grid.getCellSize(), 0);
                    this.col--;
                }
                break;

            case KeyboardEvent.KEY_RIGHT:
                if (this.col < grid.getCol() - 1) {
                    cursor.translate(grid.getCellSize(), 0);
                    this.col++;
                }
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
 /*   public void write() throws IOException {
        this.reader = new Reader();
        if(grid.getCells()[col][row].getPainted() == false){
            reader.writer0();
        }
        reader.writer1();
    }*/


}
