package org.academiadecodigo.bootcamp.gameObject;

import org.academiadecodigo.bootcamp.grid.position.SimpleGfxGridPosition;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 12/02/2017.
 */
public class StartLevel {

    private SimpleGfxGridPosition position;
    private Rectangle rectangle;
    private Picture picture;

    public StartLevel(SimpleGfxGridPosition simpleGfxGridPosition) {
        position = simpleGfxGridPosition;
        picture = new Picture((getPos().getCol() * 32) + 10, (getPos().getRow() * 32) + 10, "Resources/Wall/StartLevel.png");
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

