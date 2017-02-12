package org.academiadecodigo.bootcamp.gameObject;

import org.academiadecodigo.bootcamp.grid.position.SimpleGfxGridPosition;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.security.Signature;

/**
 * Created by codecadet on 11/02/17.
 */
public class FinishLine extends GameObject{

    private SimpleGfxGridPosition position;
    private Rectangle rectangle;

    public FinishLine (SimpleGfxGridPosition simpleGfxGridPosition) {
        position = simpleGfxGridPosition;
        rectangle = new Rectangle((getPos().getCol() * 32) + 10, (getPos().getRow() * 32) + 10, 32, 32);
        rectangle.setColor(Color.GRAY);
        rectangle.fill();

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
}
