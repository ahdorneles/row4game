package org.academiadecodigo.bootcamp.gameObject;

/*import org.academiadecodigo.bootcamp.game.CollisionDetector;*/

import org.academiadecodigo.bootcamp.game.CollisionDetector;
import org.academiadecodigo.bootcamp.grid.GridDirection;
import org.academiadecodigo.bootcamp.grid.SimpleGfxGrid;
import org.academiadecodigo.bootcamp.grid.position.SimpleGfxGridPosition;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.io.DataInput;

/**
 * Created by codecadet on 06/02/2017.
 */
public class Avatar extends GameObject {
    private SimpleGfxGridPosition position;
    private GridDirection direction;
    private SimpleGfxGrid grid;
    private CollisionDetector collisionDetector;
    private Picture picture;
    private int moveCounter;
    private GridDirection lastDirection = GridDirection.DOWN;


    public Avatar(SimpleGfxGridPosition position) {
        this.position = position;
        grid = (SimpleGfxGrid) position.getGrid();
        collisionDetector = new CollisionDetector(this, position, grid);
        picture = new Picture((getPos().getCol() * super.cellSize()) + super.padding(), (getPos().getRow() * super.cellSize()) + super.padding(), "resources/Avatar/DOWN/Avatar0.png");
        picture.draw();
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

    private void nextPictureSetup() {
        picture.delete();

        if (moveCounter >= 3 || lastDirection != direction) {
            moveCounter = 0;
        } else {
            moveCounter++;
        }
    }


    public void move(GridDirection direction) {
        this.direction = direction;


        switch (direction) {

            case UP:

                if (!collisionDetector.getCollided(getPos().getRow() - 1, getPos().getCol())) {
                    nextPictureSetup();
                    this.position.setRow(getPos().getRow() - 1);
                    picture = new Picture((getPos().getCol() * super.cellSize()) + super.padding(), (getPos().getRow() * super.cellSize()) + super.padding(), "Resources/Avatar/UP/Avatar" + moveCounter + ".png");
                    picture.draw();
                }
                lastDirection = direction;

                break;

            case DOWN:
                if (!collisionDetector.getCollided(getPos().getRow() + 1, getPos().getCol())) {
                    nextPictureSetup();
                    this.position.setRow(getPos().getRow() + 1);
                    picture = new Picture((getPos().getCol() * super.cellSize()) + super.padding(), (getPos().getRow() * super.cellSize()) + super.padding(), "Resources/Avatar/DOWN/Avatar" + moveCounter + ".png");
                    picture.draw();
                }
                lastDirection = direction;

                break;

            case RIGHT:

                if (!collisionDetector.getCollided(getPos().getRow(), getPos().getCol() + 1)) {
                    nextPictureSetup();
                    this.position.setCol(getPos().getCol() + 1);
                    picture = new Picture((getPos().getCol() * super.cellSize()) + super.padding(), (getPos().getRow() * super.cellSize()) + super.padding(), "Resources/Avatar/RIGHT/Avatar" + moveCounter + ".png");
                    picture.draw();
                }
                lastDirection = direction;
                break;

            case LEFT:

                if (!collisionDetector.getCollided(getPos().getRow(), getPos().getCol() - 1)) {
                    nextPictureSetup();
                    this.position.setCol(getPos().getCol() - 1);
                    picture = new Picture((getPos().getCol() * super.cellSize()) + super.padding(), (getPos().getRow() * super.cellSize()) + super.padding(), "Resources/Avatar/LEFT/Avatar" + moveCounter + ".png");
                    picture.draw();
                }

                lastDirection = direction;
                break;

        }


    }

    public Picture getPicture() {
        return picture;
    }
}


