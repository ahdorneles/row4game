package org.academiadecodigo.bootcamp.gameObject;
import org.academiadecodigo.bootcamp.grid.SimpleGfxGrid;
import org.academiadecodigo.bootcamp.grid.position.SimpleGfxGridPosition;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
/**
 * Created by codecadet on 12/02/17.
 */
public class Menu extends GameObject {
    private SimpleGfxGridPosition position;
    private Picture picture;
    public static Picture backckground;

    public Menu(SimpleGfxGridPosition simpleGfxGridPosition) {
        picture = new Picture(SimpleGfxGrid.PADDING, SimpleGfxGrid.PADDING, "Resources/Menu/firstImage.png");
        backckground = new Picture(SimpleGfxGrid.PADDING, SimpleGfxGrid.PADDING, "Resources/Floor/Floor.jpg");
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