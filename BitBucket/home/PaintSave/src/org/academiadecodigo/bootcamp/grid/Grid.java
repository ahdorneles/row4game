package org.academiadecodigo.bootcamp.grid;

import org.academiadecodigo.simplegraphics.graphics.*;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.awt.*;

/**
 * Created by codecadet on 14/02/17.
 */
public class Grid extends AbstractGrid {
    private int col;
    private int row;
    private int cellSize = 40;
    private Rectangle rectangle;
    private int Padding = 10;

    public Grid(int col, int row) {
        this.col = col;
        this.row = row;
        rectangle = new Rectangle(Padding, Padding, col * cellSize, row * cellSize);
        rectangle.setColor(Color.BLACK);
        rectangle.draw();
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

    public int getPadding() {
        return Padding;
    }

    @Override
    public String toString() {
        return "Coluna " + getCol() + " Linha " + getRow();
    }





}
