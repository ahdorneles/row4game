package org.academiadecodigo.bootcamp.gameObject;

import org.academiadecodigo.bootcamp.game.CollisionDetector;
import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.grid.GridDirection;
import org.academiadecodigo.bootcamp.grid.position.SimpleGfxGridPosition;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by codecadet on 06/02/2017.
 */
public class Avatar extends GameObject {
    private SimpleGfxGridPosition position;
    private GridDirection direction;
    private Grid grid;
    private CollisionDetector collisionDetector;
    Rectangle rectangle;


    public Avatar(SimpleGfxGridPosition position) {
        this.position = position;
        rectangle = new Rectangle((getPos().getCol() * 25) + 10, (getPos().getRow() * 25) + 10, 25, 25);
        rectangle.setColor(Color.BLUE);
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

    public GridDirection getDirection()
    {
        return direction;
    }

    public void moveInDirection(GridDirection direction) {

        switch (direction) {
            case UP:
                moveUp();
                break;
            case DOWN:
                moveDown();
                break;
            case RIGHT:
                moveRight();
                break;
            case LEFT:
                moveLeft();
                break;

        }

    }



    private void moveUp() {
        int inicialCol = this.getPos().getCol();
        int inicialRow = this.getPos().getRow();


        moveInDirection(direction);

        rectangle.translate((getPos().getRow() - inicialRow) * 25, (getPos().getCol() - inicialCol) * 25);


    }
    private void moveDown() {
        this.getPos().setRow((getPos().getRow()* 25) + 25);
    }

    private void moveRight() {
        this.getPos().setCol(getPos().getRow() + 1);
    }
    private void moveLeft() {
        this.getPos().setCol(getPos().getRow() - 1);
    }

    @Override
    public void move(GridDirection direction) {
        moveInDirection(direction);

    }
}
