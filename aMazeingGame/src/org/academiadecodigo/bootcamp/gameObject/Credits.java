package org.academiadecodigo.bootcamp.gameObject;
import org.academiadecodigo.bootcamp.grid.position.SimpleGfxGridPosition;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
/**
 * Created by codecadet on 12/02/17.
 */
public class Credits {
    private SimpleGfxGridPosition position;
    private Rectangle rectangle;
    private Picture picture;
    public Credits(SimpleGfxGridPosition simpleGfxGridPosition) {
        position = simpleGfxGridPosition;
       /* rectangle = new Rectangle(800, 600 ,25,25);
        rectangle.setColor(Color.GREEN);
        rectangle.fill();*/
        picture = new Picture(10, 10, "/Users/codecadet/Desktop/row4Game/row4game/aMazeingGame/Resources/Credits/credits.jpg");
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
