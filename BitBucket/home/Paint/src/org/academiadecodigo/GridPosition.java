package org.academiadecodigo;

import org.academiadecodigo.simplegraphics.graphics.*;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by codecadet on 14/02/17.
 */
public class GridPosition {
    private Rectangle rectangle;
    private Grid grid;
    private ArrayList<Object> arrayList;

    public GridPosition( Grid grid) {
        this.arrayList = new ArrayList<>();
        this.grid = grid;

        for (int i = 0; i < grid.getCol(); i++) {
            for (int j = 0; j < grid.getRow(); j++) {
                rectangle = new Rectangle((i * grid.getCellSize()) + grid.getPadding(), (j * grid.getCellSize()) + grid.getPadding(), grid.getCellSize(), grid.getCellSize() );
                arrayList.add(rectangle);
                System.out.println(arrayList.size());
                rectangle.setColor(Color.RED);
                rectangle.draw();

            }

        }
    }

    public int getCellSize(){
        return grid.getCellSize();
    }

    public int getRow(){
        return grid.getRow();
    }

    public int getCol(){
        return grid.getCol();
    }


}
