package org.academiadecodigo.bootcamp.grid;

/**
 * Created by codecadet on 14/02/17.
 */
public enum GridEnum {
    MENU(new int[][]{{0, 0, 0, 0, 0 ,0},
            {0, 0, 0, 0, 0 ,0},
            {0, 0, 0, 0, 0 ,0},
            {0, 0, 0, 0, 0 ,0},
            {0, 0, 0, 0, 0 ,0},
            {0, 0, 0, 0, 0 ,0}}),;


    private int [][] blocks;

    GridEnum(int[][] blocks) {
        this.blocks = blocks;
    }

    public int[][] getBlocks() {
        return blocks;
    }
}
