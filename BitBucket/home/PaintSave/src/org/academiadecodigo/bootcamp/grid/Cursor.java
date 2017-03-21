package org.academiadecodigo.bootcamp.grid;

import org.academiadecodigo.simplegraphics.graphics.*;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


import java.awt.*;

/**
 * Created by codecadet on 14/02/17.
 */
public class Cursor extends GameObject {
    private Rectangle rectangle;
    private Grid position;


    public Cursor(Grid position) {
        this.rectangle = new Rectangle(position.getPadding(), position.getPadding(), position.getCol(), position.getRow());
        rectangle.setColor(Color.RED);
        rectangle.fill();
    }

    public Grid getPos(){
        return position;
    }


}
