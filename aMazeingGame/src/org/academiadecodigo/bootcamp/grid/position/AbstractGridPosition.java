package org.academiadecodigo.bootcamp.grid.position;

import org.academiadecodigo.bootcamp.grid.Grid;

/**
 * Created by codecadet on 06/02/2017.
 */
public abstract class AbstractGridPosition {
    private int col;
    private int row;
    private Grid grid;

    public AbstractGridPosition(int col, int row, Grid grid) {
        this.col = col;
        this.row = row;
        this.grid = grid;
    }

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

    public Grid getGrid() {
        return grid;
    }
}
