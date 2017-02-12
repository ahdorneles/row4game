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
    private Rectangle rectangle;
    private Picture picture;

    public Wall(SimpleGfxGridPosition simpleGfxGridPosition) {
        position = simpleGfxGridPosition;
        //rectangle = new Rectangle((getPos().getCol() * 25) + 10,(getPos().getRow()* 25) + 10 ,25,25);
        //rectangle.setColor(Color.GREEN);
        //rectangle.fill();
        picture = new Picture((getPos().getCol() * 32) + 10, (getPos().getRow() * 32) + 10, "/Users/codecadet/Desktop/row4Game/row4game/aMazeingGame/Resources/Wall/Wall3.png");
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

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    public Picture getPicture() {
        return picture;
    }
}
