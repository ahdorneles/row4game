package org.academiadecodigo;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import static org.academiadecodigo.GridDirection.UP;

/**
 * Created by codecadet on 14/02/17.
 */
public class Cell {
    private int col = 10;
    private int row = 10;
    private Rectangle rectangle;
    private GridDirection gridDirection;
    int initialCol = col;
    int initialRow = row;
    private Grid grid;
    private GridPosition gridPosition;

    public Cell(GridPosition gridPosition) {

        this.initialCol = col;
        this.initialRow = row;
        rectangle = new Rectangle(col, row, gridPosition.getCellSize(), gridPosition.getCellSize());
        rectangle.setColor(Color.BLUE);
        rectangle.fill();
    }


    public void move(GridDirection gridDirection) {
        gridPosition = new GridPosition(grid);
        switch (gridDirection) {
            case UP:
                setRow(getRow() - 1);
                rectangle.translate(0, -gridPosition.getCellSize());

                break;

            case DOWN:
                setRow(getRow() + 1);
                rectangle.translate(0, 30);


                break;

            case LEFT:
                break;

            case RIGHT:
                break;
        }


    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public GridDirection getGridDirection() {
        return gridDirection;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
    }
}
