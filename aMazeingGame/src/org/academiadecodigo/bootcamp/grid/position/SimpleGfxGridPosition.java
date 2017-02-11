package org.academiadecodigo.bootcamp.grid.position;

import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.grid.GridDirection;

/**
 * Created by codecadet on 07/02/17.
 */
public class SimpleGfxGridPosition extends AbstractGridPosition {

    private Grid grid;
    private int col;
    private int row;

    public SimpleGfxGridPosition(int col, int row, Grid grid) {
        super(col, row, grid);
    }

    @Override
    public String toString() {
       return  "Coluna " + col + " Linha "+ row;
    }
}
