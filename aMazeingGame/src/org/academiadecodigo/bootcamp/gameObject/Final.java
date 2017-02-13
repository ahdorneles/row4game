package org.academiadecodigo.bootcamp.gameObject;

import org.academiadecodigo.bootcamp.grid.SimpleGfxGrid;
import org.academiadecodigo.bootcamp.grid.position.SimpleGfxGridPosition;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 13/02/17.
 */
public class Final extends GameObject {

        private SimpleGfxGridPosition position;
        private Rectangle rectangle;
        private Picture picture;
        public static Picture backckground;

        public Final(SimpleGfxGridPosition simpleGfxGridPosition) {
            picture = new Picture(SimpleGfxGrid.PADDING, SimpleGfxGrid.PADDING, "Resources/FinalStage/stageCleared.png");

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
