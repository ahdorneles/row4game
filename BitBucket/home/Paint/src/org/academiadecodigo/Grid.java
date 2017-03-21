package org.academiadecodigo;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by codecadet on 14/02/17.
 */
public class Grid {
    private Rectangle rectangle;
    private int padding = 10;
    private int col;
    private int row;
    private int cellSize = 30;


    public Grid(int col, int row){
        this.col = col;
        this.row = row;
        this.rectangle = new Rectangle(padding, padding, this.col * cellSize, this.row * cellSize );
        rectangle.setColor(Color.BLUE);
        rectangle.draw();
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public int getPadding() {
        return padding;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public int getCellSize() {
        return cellSize;
    }
}
