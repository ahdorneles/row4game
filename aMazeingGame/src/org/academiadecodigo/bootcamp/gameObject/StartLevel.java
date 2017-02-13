package org.academiadecodigo.bootcamp.gameObject;

import org.academiadecodigo.bootcamp.grid.position.SimpleGfxGridPosition;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 12/02/2017.
 */
public class StartLevel extends GameObject {

    private SimpleGfxGridPosition position;
    private Picture picture;

    public StartLevel(SimpleGfxGridPosition simpleGfxGridPosition) {
        position = simpleGfxGridPosition;
        picture = new Picture((getPos().getCol() * super.cellSize()) + super.padding(), (getPos().getRow() * super.cellSize()) + super.padding(), "Resources/Wall/Start.png");
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

