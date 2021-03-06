package org.academiadecodigo.bootcamp.gameObject;

import org.academiadecodigo.bootcamp.grid.position.SimpleGfxGridPosition;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 11/02/17.
 */
public class FinishLine extends GameObject {

    private SimpleGfxGridPosition position;
    private Picture picture;

    public FinishLine(SimpleGfxGridPosition simpleGfxGridPosition) {
        position = simpleGfxGridPosition;
        picture = new Picture((getPos().getCol() * super.cellSize()) + super.padding(), (getPos().getRow() * super.cellSize()) + super.padding(), "resources/Wall/FinishLine.png");
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
