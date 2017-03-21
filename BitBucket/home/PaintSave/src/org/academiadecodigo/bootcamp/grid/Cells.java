package org.academiadecodigo.bootcamp.grid;

import java.util.ArrayList;

/**
 * Created by codecadet on 14/02/17.
 */
public class Cells implements GridInter {
    private ArrayList<GameObject> objectList;


    @Override
    public ArrayList<GameObject> init(int[][] array) {
        objectList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            System.out.println("row" + i);
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("col" + j);

                int block = array[i][j];

                if (block == 0){
                    objectList.add(Grid);
                }

            }
        }

        return objectList;
    }

    @Override
    public int getCols() {
        return 0;
    }

    @Override
    public int getRows() {
        return 0;
    }
}
