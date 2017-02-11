package org.academiadecodigo.bootcamp.gameObject;

/*import org.academiadecodigo.bootcamp.game.CollisionDetector;*/

import org.academiadecodigo.bootcamp.game.CollisionDetector;
import org.academiadecodigo.bootcamp.grid.GridDirection;
import org.academiadecodigo.bootcamp.grid.SimpleGfxGrid;
import org.academiadecodigo.bootcamp.grid.position.SimpleGfxGridPosition;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

/**
 * Created by codecadet on 06/02/2017.
 */
public class Avatar extends GameObject {
    private static final double SPEED = 25;
    private SimpleGfxGridPosition position;
    private GridDirection direction;
    private SimpleGfxGrid grid;
    private CollisionDetector collisionDetector;
    private Rectangle rectangle;


    public Avatar(SimpleGfxGridPosition position) {
        this.position = position;
        grid = (SimpleGfxGrid) position.getGrid();
        collisionDetector = new CollisionDetector(this, position, grid);
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

    public GridDirection getDirection() {
        return direction;
    }

    public void move(GridDirection direction) {
        int initialCol = this.getPos().getCol();
        int initialRow = this.getPos().getRow();
        System.out.println("Coluna " + initialCol);
        System.out.println("Linha " + initialRow);


        switch (direction) {
            case UP:
                if (!collisionDetector.getCollided(getPos().getRow() - 1, getPos().getCol())) {
                    System.out.println("inside if condition");
                    this.position.setRow(getPos().getRow() - 1);
                    int finalRowUp = getPos().getRow();
                    System.out.println("Direção " + direction);
                    rectangle.translate(0, (finalRowUp - initialRow) * SPEED);
                }
                System.out.println("outside if condition");
                break;

            case DOWN:
                if (!collisionDetector.getCollided(getPos().getRow() + 1, getPos().getCol())) {
                    this.position.setRow(getPos().getRow() + 1);
                    int finalRowDown = getPos().getRow();
                    System.out.println("Direção " + direction);
                    rectangle.translate(0, (finalRowDown - initialRow) * SPEED);
                }
                break;

            case RIGHT:
                if (!collisionDetector.getCollided(getPos().getRow(), getPos().getCol() + 1)) {
                    this.position.setCol(getPos().getCol() + 1);
                    int finalColRight = getPos().getCol();
                    System.out.println("Direção " + direction);
                    rectangle.translate((finalColRight - initialCol) * SPEED, 0);
                }
                break;
            case LEFT:
                if (!collisionDetector.getCollided(getPos().getRow(), getPos().getCol() - 1)) {
                    this.position.setCol(getPos().getCol() - 1);
                    int finalColLeft = getPos().getCol();
                    System.out.println("Direção " + direction);
                    rectangle.translate((finalColLeft - initialCol) * SPEED, 0);
                }
                break;

        }


    }

    public Rectangle getRectangle() {
        return rectangle;
    }


}


