package org.academiadecodigo.bootcamp.grid;

import org.academiadecodigo.bootcamp.gameObject.Avatar;
import org.academiadecodigo.bootcamp.gameObject.GameObject;
import org.academiadecodigo.bootcamp.gameObject.ObjectType;
import org.academiadecodigo.bootcamp.gameObject.Wall;
import org.academiadecodigo.bootcamp.grid.position.SimpleGfxGridPosition;

import java.util.ArrayList;

/**
 * Created by codecadet on 06/02/2017.
 */
public class SimpleGfxGrid implements Grid {

    public static final int PADDING = 10;
    private int cols;
    private int rows;
    public static final int CELL_SIZE = 25;
    private ArrayList<GameObject> objectList;

    public SimpleGfxGrid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
    }


    @Override
    public void init(int[][] array) {

        objectList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                int block = array[i][j];

                switch (block) {

                    case 0:
                        break;

                    case 1:
                        objectList.add(create(i, j, ObjectType.AVATAR));
                        break;

                    case 2:
                        objectList.add(create(i, j, ObjectType.WALL));
                        break;
                }
            }
        }

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
                Wall wall = new Wall();
                SimpleGfxGridPosition position1 = new SimpleGfxGridPosition(i, j, this);
                wall.setPosition(position1);
                returnObject = wall;
                break;

        }
        return returnObject;
    }


    @Override
    public int getCols() {
        return cols;
    }

    @Override
    public int getRows() {
        return rows;
    }

    public static int getCellSize() {
        return CELL_SIZE;
    }

    public int getHeight() {
        return getRows() * getCellSize();
    }

    public int getWidth() {
        return getCols() * getCellSize();
    }
}


