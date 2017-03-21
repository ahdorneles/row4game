package org.academiadecodigo;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;

/**
 * Created by codecadet on 14/02/17.
 */
public class PaintStarter {
    private Grid grid;
    private GridPosition gridPosition;
    private Cell cell;
    private KeyBoardInput keyBoardInput;

    public void init(){

        this.grid = new Grid(10, 10);
        this.gridPosition = new GridPosition(grid);
        this. keyBoardInput = new KeyBoardInput(gridPosition);
        this.cell = new Cell(gridPosition);
    }
}
