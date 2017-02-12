package org.academiadecodigo.bootcamp.gameObject;

import org.academiadecodigo.bootcamp.grid.GridDirection;
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
}
