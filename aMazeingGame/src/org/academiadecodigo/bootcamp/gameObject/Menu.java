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
    private Rectangle rectangle;
    private Picture picture;

    public Menu(SimpleGfxGridPosition simpleGfxGridPosition) {
        picture = new Picture(10, 10, "/Users/codecadet/Desktop/row4Game/row4game/aMazeingGame/Resources/Menu/FirstImage_1200px900.jpg");
        picture.draw();
    }

    public SimpleGfxGridPosition getPos() {
        return position;
    }

    public void setPosition(SimpleGfxGridPosition position) {
        this.position = position;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public Picture getPicture() {
        return picture;
    }

}