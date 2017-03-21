package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.grid.Cursor;

/**
 * Created by codecadet on 14/02/17.
 */
public class Start {
    private int delay;
    private Cursor cursor;
    private Grid grid;

    public Start(int delay){
        this.delay = delay;
    }

    public void init() throws InterruptedException {
        java.lang.Thread.sleep(delay);

        this.grid = new Grid(20,20);
        this.cursor = new Cursor(grid);
    }

}
