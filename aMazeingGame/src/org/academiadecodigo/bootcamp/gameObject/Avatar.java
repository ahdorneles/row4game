package org.academiadecodigo.bootcamp.gameObject;
import org.academiadecodigo.bootcamp.game.CollisionDetector;
import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.grid.GridDirection;
import org.academiadecodigo.bootcamp.grid.position.SimpleGfxGridPosition;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by codecadet on 06/02/2017.
 */
public class Avatar extends GameObject {
    private SimpleGfxGridPosition position;
    private GridDirection direction;
    private Grid grid;
    private CollisionDetector collisionDetector;


    public Avatar(SimpleGfxGridPosition position) {
        this.position = position;
        Rectangle rectangle = new Rectangle(2,3,10,10);
        rectangle.fill();
    }
    public SimpleGfxGridPosition getPos() {
        return position;
    }
    public void setPosition(SimpleGfxGridPosition position) {
        this.position = position;
    }
    public void setDirection(GridDirection direction) {
        this.direction = direction;
    }
    public GridDirection getDirection() {
        return direction;
    }

  /*  @Override
    public void move() {
        switch (direction) {
            case UP:
                if (!collisionDetector.getCollided()) {
                    this.getPos().setRow(getRow() - 1);
                }
                break;
            case DOWN:
                if (!collisionDetector.getCollided()) {
                    this.getPos().setRow(getRow() + 1);
                }
                break;
            case LEFT:
                if (!collisionDetector.getCollided()) {
                    this.getPos().setCol(getCol() - 1);
                }
                break;
            case RIGHT:
                if (!collisionDetector.getCollided()) {
                    this.getPos().setCol(getCol() + 1);
                }
                break;
            default:
                // Exception
                System.out.println("Bananas");
                break;
        }
    }*/
}
