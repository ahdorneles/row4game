package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.io.IOException;

/**
 * Created by codecadet on 14/02/17.
 */
public class Grid {
    private int col;
    private int row;
    private int padding = 10;
    private int cellSize = 30;
    private int height;
    private int width;
    private Cell[][] cells;
    private Reader reader;


    public Grid(int col, int row) throws IOException {
        this.col = col;
        this.row = row;
        this.height = row * cellSize;
        this.width = col * cellSize;
        this.cells = new Cell[col][row];
        this.reader = new Reader();


    }

    public void init() {
        Cursor cursor = new Cursor();
        cursor.init(0, 0, this);

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                cells[i][j] = new Cell(i, j, this);

            }
        }


    }

    public void saving() throws IOException {
        this.reader = new Reader();
        for (int i = 0; i < cells.length; i++) {
            if (this.getCells()[col - 1][row - 1].getPainted() == false) {
                reader.writer0();
            }
            reader.writer1();
        }
    }


    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public int getPadding() {
        return padding;
    }

    public int getCellSize() {
        return cellSize;
    }

    public Cell[][] getCells() {
        return cells;
    }


}
