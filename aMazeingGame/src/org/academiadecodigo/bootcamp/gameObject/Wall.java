package org.academiadecodigo.bootcamp.gameObject;

import org.academiadecodigo.bootcamp.grid.GridDirection;
import org.academiadecodigo.bootcamp.grid.SimpleGfxGrid;
import org.academiadecodigo.bootcamp.grid.position.SimpleGfxGridPosition;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 06/02/2017.
 */
public class Wall extends GameObject {

    private SimpleGfxGridPosition position;
    private Picture picture;

    public Wall(SimpleGfxGridPosition simpleGfxGridPosition) {
        position = simpleGfxGridPosition;
        picture = new Picture((getPos().getCol() * super.cellSize()) + super.padding(), (getPos().getRow() * super.cellSize()) + super.padding(), "resources/Wall/Wall3.png");
        picture.draw();
    }

    public SimpleGfxGridPosition getPos() {
        return position;
    }

    public void setPosition(SimpleGfxGridPosition position) {
        this.position = position;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    public Picture getPicture() {
        return picture;
    }
}
