package org.academiadecodigo.bootcamp.grid.position;

/**
 * Created by codecadet on 06/02/2017.
 */
public abstract class AbstractGridPosition implements GridPosition {
    private int col;
    private int row;

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
