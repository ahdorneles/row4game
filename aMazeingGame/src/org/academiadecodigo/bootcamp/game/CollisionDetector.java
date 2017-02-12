//**
package org.academiadecodigo.bootcamp.game;

import org.academiadecodigo.bootcamp.gameObject.Wall;


import org.academiadecodigo.bootcamp.gameObject.Avatar;
import org.academiadecodigo.bootcamp.gameObject.GameObject;
import org.academiadecodigo.bootcamp.grid.GridDirection;
import org.academiadecodigo.bootcamp.grid.SimpleGfxGrid;
import org.academiadecodigo.bootcamp.grid.position.SimpleGfxGridPosition;

import java.util.ArrayList;

import static org.academiadecodigo.bootcamp.grid.GridDirection.UP;


public class CollisionDetector {
    private Avatar avatar;
    private SimpleGfxGridPosition position;
    private SimpleGfxGrid grid;
    private ArrayList<GameObject> objectList;

    public CollisionDetector(Avatar avatar, SimpleGfxGridPosition position, SimpleGfxGrid grid) {
        this.avatar = avatar;
        this.position = position;
        this.grid = grid;
        objectList = grid.getObjectList();

    }


    public boolean collided(int row, int col) {

        for (GameObject wall : objectList) {
            if (wall instanceof Wall) {
                Wall w = (Wall) wall;
                if (w.getPos().getRow() == row && w.getPos().getCol() == col) {
                    System.out.println("colidindo");
                    return true;
                }
            }
        }
        return false;
    }

    public boolean getCollided(int row, int col) {
        return collided(row, col);
    }
}

