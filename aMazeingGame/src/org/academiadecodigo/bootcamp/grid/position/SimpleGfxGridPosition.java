package org.academiadecodigo.bootcamp.grid.position;

import org.academiadecodigo.bootcamp.grid.Grid;

/**
 * Created by codecadet on 07/02/17.
 */
public class SimpleGfxGridPosition extends AbstractGridPosition {

    public SimpleGfxGridPosition(int col, int row, Grid grid) {
        super(col, row, grid);
    }

    @Override
    public Grid getGrid() {
        return super.getGrid();
    }

    @Override
    public String toString() {
       return  "Coluna " + getCol() + " Linha "+ getRow();
    }

    public boolean compare(SimpleGfxGridPosition position) {

        if (getCol() == position.getCol() && getRow() == position.getRow()) {
            return true;
        }
        return false;
    }
}
