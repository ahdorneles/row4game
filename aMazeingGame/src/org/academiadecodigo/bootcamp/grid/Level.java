package org.academiadecodigo.bootcamp.grid;

/**
 * Created by codecadet on 06/02/2017.
 */
public enum Level {

    LEVEL_1(new int[][]{{2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
            {2, 1, 0, 0, 0, 2, 0, 2, 0, 2},
            {2, 0, 0, 0, 0, 0, 2, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 2, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 2, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 2, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 2, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 2, 0, 0, 2},
            {2, 0, 0, 0, 0, 0, 2, 0, 0, 2},
            {2, 2, 2, 2, 2, 2, 2, 2, 2, 2} });
/*    LEVEL_2(),*/
/*    LEVEL_3(),*/
/*    TEST();*/

    private int[][] level;

    Level(int[][] level) {
        this.level = level;
    }

    public int[][] getLevel() {
        return level;
    }
}
