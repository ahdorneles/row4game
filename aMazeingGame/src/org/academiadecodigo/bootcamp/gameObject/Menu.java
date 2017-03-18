package org.academiadecodigo.bootcamp.gameObject;

import org.academiadecodigo.bootcamp.grid.SimpleGfxGrid;
import org.academiadecodigo.bootcamp.grid.position.SimpleGfxGridPosition;
import org.academiadecodigo.simplegraphics.pictures.Picture;
/**
 * Created by codecadet on 12/02/17.
 */
public class Menu extends GameObject {
    private SimpleGfxGridPosition position;
    private Picture picture;
    public static Picture background;

    public Menu(SimpleGfxGridPosition simpleGfxGridPosition) {
        picture = new Picture(SimpleGfxGrid.PADDING, SimpleGfxGrid.PADDING, "resources/Menu/firstimage.png");
        background = new Picture(SimpleGfxGrid.PADDING, SimpleGfxGrid.PADDING, "resources/Floor/Floor.jpg");
        picture.draw();
    }

    public SimpleGfxGridPosition getPos() {
        return position;
    }

    public void setPosition(SimpleGfxGridPosition position) {
        this.position = position;
    }


    public Picture getPicture() {
        return picture;
    }

}