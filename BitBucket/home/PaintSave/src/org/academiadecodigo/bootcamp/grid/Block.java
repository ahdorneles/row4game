package org.academiadecodigo.bootcamp.grid;
import org.academiadecodigo.simplegraphics.graphics.*;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.awt.*;

/**
 * Created by codecadet on 14/02/17.
 */
public class Block extends GameObject {
    private Rectangle rectangle;
    private Grid position;


    public Block(Grid grid){
        this.rectangle = new Rectangle(getPosition().getCol(), getPosition().getRow(), 10, 10);
        this.rectangle.setColor(Color.GRAY);
        rectangle.draw();
    }

    public Grid getPosition() {
        return position;
    }
}
