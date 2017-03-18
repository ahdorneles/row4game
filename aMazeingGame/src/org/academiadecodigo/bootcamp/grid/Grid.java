package org.academiadecodigo.bootcamp.grid;

import org.academiadecodigo.bootcamp.gameObject.GameObject;

import java.util.ArrayList;

/**
 * Created by codecadet on 06/02/2017.
 */
public interface Grid {

    ArrayList<GameObject> init(int[][] array);

    int getCols();

    int getRows();

}
