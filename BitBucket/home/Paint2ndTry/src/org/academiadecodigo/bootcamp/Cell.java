package org.academiadecodigo.bootcamp;


import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.util.ArrayList;

/**
 * Created by codecadet on 14/02/17.
 */
public class Cell {
    private int row;
    private int col;
    private int padding = 10;
    private boolean painted = false;

    private Rectangle cell;

    public Cell(int col, int row, Grid grid) {
        this.col = col;
        this.row = row;
        cellInit(grid);
        this.painted = false;
        System.out.println(painted);

    }

    public void cellInit(Grid grid) {
        this.cell = new Rectangle(padding + col * grid.getCellSize(), padding + row * grid.getCellSize(), grid.getCellSize(), grid.getCellSize());
        cell.setColor(Color.DARK_GRAY);
        cell.draw();
        System.out.println(cell);
    }

    public void paint() {
        if (painted == false) {
            cell.setColor(Color.BLACK);
            cell.fill();
            painted = true;
        } else {
            cell.setColor(Color.DARK_GRAY);
            cell.draw();
            painted = false;

        }
    }




    public boolean getPainted() {
        return painted;
    }
    public Rectangle getPaintedRec(){
        if(cell.getColor() == Color.DARK_GRAY){
            painted = false;
        }
         painted = true;
        return cell;
    }
}



