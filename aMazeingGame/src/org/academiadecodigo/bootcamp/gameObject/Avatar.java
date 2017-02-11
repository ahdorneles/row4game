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
public class Avatar extends GameObject implements KeyboardHandler{
    private static final double SPEED = 25;
    private SimpleGfxGridPosition position;
    private GridDirection direction;
    private SimpleGfxGrid grid;
    private CollisionDetector collisionDetector;
    private Rectangle rectangle;
    private Keyboard k;



    public Avatar(SimpleGfxGridPosition position) {
        this.position = position;
        grid = (SimpleGfxGrid) position.getGrid();
        collisionDetector = new CollisionDetector(this, position, grid);
        rectangle = new Rectangle((getPos().getCol() * 25) + 10, (getPos().getRow() * 25) + 10, 25, 25);
        rectangle.setColor(Color.BLUE);
        rectangle.fill();

        k = new Keyboard((KeyboardHandler) this);
        KeyboardEvent up = new KeyboardEvent();
        KeyboardEvent down = new KeyboardEvent();
        KeyboardEvent left = new KeyboardEvent();
        KeyboardEvent right = new KeyboardEvent();
        KeyboardEvent reset = new KeyboardEvent();
        KeyboardEvent start = new KeyboardEvent();
        KeyboardEvent quit = new KeyboardEvent();

        up.setKey(KeyboardEvent.KEY_UP);
        down.setKey(KeyboardEvent.KEY_DOWN);
        left.setKey(KeyboardEvent.KEY_LEFT);
        right.setKey(KeyboardEvent.KEY_RIGHT);
        reset.setKey(KeyboardEvent.KEY_R);
        start.setKey(KeyboardEvent.KEY_SPACE);
        quit.setKey(KeyboardEvent.KEY_Q);

        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        reset.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        start.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        quit.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        k.addEventListener(up);
        k.addEventListener(down);
        k.addEventListener(left);
        k.addEventListener(right);
        k.addEventListener(reset);
        k.addEventListener(start);
        k.addEventListener(quit);

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

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {


        for (GameObject avatar1 : grid.getObjectList()) {
            if (avatar1 instanceof Avatar) {

                Avatar avatar = (Avatar) avatar1;

                System.out.println("Posição do avatar" + ((Avatar) avatar).getPos());
                System.out.println("List size " + grid.getObjectList().size());


                switch (keyboardEvent.getKey()) {
                    case KeyboardEvent.KEY_UP:
                        avatar.move(GridDirection.UP);
                        break;
                    case KeyboardEvent.KEY_DOWN:
                        avatar.move(GridDirection.DOWN);
                        break;
                    case KeyboardEvent.KEY_LEFT:
                        avatar.move(GridDirection.LEFT);
                        break;
                    case KeyboardEvent.KEY_RIGHT:
                        avatar.move(GridDirection.RIGHT);
                        break;

                }
            }
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
