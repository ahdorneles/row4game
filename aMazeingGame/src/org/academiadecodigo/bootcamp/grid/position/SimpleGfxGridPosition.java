package org.academiadecodigo.bootcamp.grid.position;

import org.academiadecodigo.bootcamp.grid.Grid;

/**
 * Created by codecadet on 07/02/17.
 */
public class SimpleGfxGridPosition extends AbstractGridPosition {

    private Grid grid;
    private int cols;
    private int rows;

    public SimpleGfxGridPosition(int cols, int rows, Grid grid) {
        super(cols, rows, grid);
    }




}
