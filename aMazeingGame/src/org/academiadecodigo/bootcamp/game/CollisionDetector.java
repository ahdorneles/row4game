package org.academiadecodigo.bootcamp.game;

import org.academiadecodigo.bootcamp.gameObject.Wall;


import org.academiadecodigo.bootcamp.gameObject.Avatar;
import org.academiadecodigo.bootcamp.gameObject.GameObject;
import org.academiadecodigo.bootcamp.grid.GridDirection;
import org.academiadecodigo.bootcamp.grid.position.SimpleGfxGridPosition;

import java.util.ArrayList;

import static org.academiadecodigo.bootcamp.grid.GridDirection.UP;

/**
 * Created by codecadet on 06/02/2017.
 */
public class CollisionDetector {

    private Avatar avatar;
    private GridDirection gridDirection;
    private SimpleGfxGridPosition gridPosition;
    private ArrayList<GameObject> objectList;


    public boolean collided() {
        switch (avatar.getDirection()) {

            case UP:

                //iterar sobre objectList instanceof Wall
                //retornar a cena

                return (avatar.getPos(). // placeholder (getRow() - 1) == .getPos());
            case DOWN:
                return (avatar.getPos(). // placeholder (getRow() + 1) == gameObjects.getPos());
            case RIGHT:
                return (avatar.getPos(). // placeholder (getCol() + 1) == gameObjects.getPos());
            case LEFT:
                return (avatar.getPos(). // placeholder (getCol() - 1) == gameObjects.getPos());
        }
    }


    public boolean getCollided() {
        return collided();
    }
}