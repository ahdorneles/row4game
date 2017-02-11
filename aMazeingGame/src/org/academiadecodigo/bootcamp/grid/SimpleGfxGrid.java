package org.academiadecodigo.bootcamp.grid;

import org.academiadecodigo.bootcamp.gameObject.*;
import org.academiadecodigo.bootcamp.grid.position.SimpleGfxGridPosition;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.util.ArrayList;

/**
 * Created by codecadet on 06/02/2017.
 */
public class SimpleGfxGrid implements Grid {

    private final int PADDING = 10;
    private int cols;
    private int rows;
    private final int CELL_SIZE = 25;
    private ArrayList<GameObject> objectList;

    public SimpleGfxGrid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
    }



    @Override
    public void init(int[][] array) {

        objectList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            System.out.println("row" + i);
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("col" + j);

                int block = array[i][j];

                switch (block) {

                    case 0:
                        break;

                    case 1:
                        objectList.add(create(j, i, ObjectType.AVATAR));
                        break;

                    case 2:
                        objectList.add(create(j, i, ObjectType.WALL));
                        break;

                    case 3:
                        objectList.add(create(j, i, ObjectType.FINISH_LINE));
                }
            }
        }

        System.out.println(objectList.size());

    }

    private GameObject create(int i, int j, ObjectType type) {

        GameObject returnObject = null;

        switch (type) {

            case AVATAR:
                SimpleGfxGridPosition position = new SimpleGfxGridPosition(i, j, this);
                Avatar avatar = new Avatar(position);
                returnObject = avatar;
                break;

            case WALL:
                SimpleGfxGridPosition position1 = new SimpleGfxGridPosition(i, j, this);
                Wall wall = new Wall(position1);
                returnObject = wall;
                break;

            case FINISH_LINE:
                SimpleGfxGridPosition position2 = new SimpleGfxGridPosition(i, j, this);
                FinishLine line = new FinishLine(position2);
                returnObject = line;
                break;

        }
        return returnObject;
    }

    public ArrayList<GameObject> getObjectList() {
        return objectList;
    }

    @Override
    public int getCols() {
        return cols;
    }

    @Override
    public int getRows() {
        return rows;
    }

    public int getCellSize() {
        return CELL_SIZE;
    }

    public int getHeight() {
        return getRows() * getCellSize();
    }

    public int getWidth() {
        return getCols() * getCellSize();
    }

    public int getPADDING() {
        return PADDING;
    }

    public int getCELL_SIZE() {
        return CELL_SIZE;
    }
}








