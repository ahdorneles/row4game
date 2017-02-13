package org.academiadecodigo.bootcamp.gameObject;

import org.academiadecodigo.bootcamp.grid.GridDirection;
import org.academiadecodigo.bootcamp.grid.SimpleGfxGrid;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 06/02/2017.
 */
public abstract class GameObject {

    private Picture picture;

    public Picture getPicture() {
        return picture;
    }

    public int padding() {
        return SimpleGfxGrid.PADDING;
    }

    public int cellSize() {
        return SimpleGfxGrid.CELL_SIZE;
    }
}
