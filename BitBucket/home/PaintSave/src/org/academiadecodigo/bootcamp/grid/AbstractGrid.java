package org.academiadecodigo.bootcamp.grid;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by codecadet on 14/02/17.
 */
abstract class AbstractGrid {
    private int col ;
    private int row;
    private int Padding = 10;
    private Rectangle rectangle;



    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
    }

}