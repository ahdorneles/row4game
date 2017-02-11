package org.academiadecodigo.bootcamp.gameObject;

import org.academiadecodigo.bootcamp.grid.GridDirection;
import org.academiadecodigo.bootcamp.grid.SimpleGfxGrid;
import org.academiadecodigo.bootcamp.grid.position.SimpleGfxGridPosition;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by codecadet on 06/02/2017.
 */
public class Wall extends GameObject {

    private SimpleGfxGridPosition position;
    private Rectangle rectangle;

    public Wall(SimpleGfxGridPosition simpleGfxGridPosition) {
        position = simpleGfxGridPosition;
        rectangle = new Rectangle((getPos().getCol() * 25) + 10,(getPos().getRow()* 25) + 10 ,25,25);
        rectangle.setColor(Color.GREEN);
        rectangle.fill();
    }

    public SimpleGfxGridPosition getPos() {
        return position;
    }

    public void setPosition(SimpleGfxGridPosition position) {
        this.position = position;
    }

    @Override
    public void move(GridDirection direction) {

    }
}
