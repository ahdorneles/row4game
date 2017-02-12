package org.academiadecodigo.bootcamp.gameObject;

/*import org.academiadecodigo.bootcamp.game.CollisionDetector;*/

import org.academiadecodigo.bootcamp.game.CollisionDetector;
import org.academiadecodigo.bootcamp.grid.GridDirection;
import org.academiadecodigo.bootcamp.grid.SimpleGfxGrid;
import org.academiadecodigo.bootcamp.grid.position.SimpleGfxGridPosition;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 06/02/2017.
 */
public class Avatar extends GameObject {
    private static final double SPEED = 32;
    private SimpleGfxGridPosition position;
    private GridDirection direction;
    private SimpleGfxGrid grid;
    private CollisionDetector collisionDetector;
    private Rectangle rectangle;
    private Picture picture;
    private int moveCounter;
    private GridDirection lastDirection;


    public Avatar(SimpleGfxGridPosition position) {
        this.position = position;
        grid = (SimpleGfxGrid) position.getGrid();
        collisionDetector = new CollisionDetector(this, position, grid);
        picture = new Picture((getPos().getCol() * 32) + 10, (getPos().getRow() * 32) + 10, "Resources/Avatar/UP/Avatar0.png");
        picture.draw();
        //rectangle = new Rectangle((getPos().getCol() * 32) + 10, (getPos().getRow() * 32) + 10, 32, 32);
        //rectangle.setColor(Color.BLUE);
        //rectangle.draw();

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
        if (direction == lastDirection && moveCounter < 4) {
            moveCounter++;
        } else {
            moveCounter = 0;
        }
    }


    public void move(GridDirection direction) {
        int initialCol = this.getPos().getCol();
        int initialRow = this.getPos().getRow();
        System.out.println("Coluna " + initialCol);
        System.out.println("Linha " + initialRow);


        switch (direction) {

            case UP:

                if (!collisionDetector.getCollided(getPos().getRow() - 1, getPos().getCol())) {
                    nextPictureSetup();
                    this.position.setRow(getPos().getRow() - 1);
                    int finalRowUp = getPos().getRow();
                    picture = new Picture((getPos().getCol() * 32) + 10, (getPos().getRow() * 32) + 10, "Resources/Avatar/UP/Avatar" + moveCounter + ".png");
                    picture.draw();
                }
                lastDirection = direction;
                break;

            case DOWN:

                if (!collisionDetector.getCollided(getPos().getRow() + 1, getPos().getCol())) {
                    nextPictureSetup();
                    this.position.setRow(getPos().getRow() + 1);
                    int finalRowDown = getPos().getRow();
                    picture = new Picture((getPos().getCol() * 32) + 10, (getPos().getRow() * 32) + 10, "Resources/Avatar/DOWN/Avatar" + moveCounter + ".png");
                    picture.draw();
                }
                lastDirection = direction;
                break;

            case RIGHT:

                if (!collisionDetector.getCollided(getPos().getRow(), getPos().getCol() + 1)) {
                    nextPictureSetup();
                    this.position.setCol(getPos().getCol() + 1);
                    int finalColRight = getPos().getCol();
                    picture = new Picture((getPos().getCol() * 32) + 10, (getPos().getRow() * 32) + 10, "Resources/Avatar/RIGHT/Avatar" + moveCounter + ".png");
                    picture.draw();
                }
                lastDirection = direction;
                break;
            case LEFT:

                if (!collisionDetector.getCollided(getPos().getRow(), getPos().getCol() - 1)) {
                    nextPictureSetup();
                    this.position.setCol(getPos().getCol() - 1);
                    int finalColLeft = getPos().getCol();
                    picture = new Picture((getPos().getCol() * 32) + 10, (getPos().getRow() * 32) + 10, "Resources/Avatar/LEFT/Avatar" + moveCounter + ".png");
                    picture.draw();
                }
                lastDirection = direction;
                break;

        }


    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public Picture getPicture() {
        return picture;
    }
}


