package org.academiadecodigo.bootcamp.gameObject;

import org.academiadecodigo.bootcamp.game.CollisionDetector;
import org.academiadecodigo.bootcamp.grid.GridDirection;
import org.academiadecodigo.bootcamp.grid.SimpleGfxGrid;
import org.academiadecodigo.bootcamp.grid.position.SimpleGfxGridPosition;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by codecadet on 06/02/2017.
 */
public class Avatar extends GameObject {
    private SimpleGfxGridPosition position;
    private GridDirection direction;
    //private SimpleGfxGrid grid;
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

    public GridDirection getDirection() {
        return direction;
    }


    @Override
    public void move(GridDirection direction) {
        int initialCol = this.getPos().getCol();
        int initialRow = this.getPos().getRow();
        System.out.println("Coluna " + initialCol);
        System.out.println("Linha " + initialRow);


        switch (direction) {
            case UP:
                this.position.setRow(getPos().getRow() - 1 );
                int finalRowUp = getPos().getRow();
                System.out.println("Direção " + direction);
                rectangle.translate(0,(finalRowUp-initialRow));
                break;
            case DOWN:
                this.position.setRow(getPos().getRow() + 1);
                int finalRowDown = getPos().getRow();
                System.out.println("Direção " + direction);
                rectangle.translate(0,(finalRowDown-initialRow) );
                break;
            case RIGHT:
                this.position.setCol(getPos().getCol() + 1);
                int finalColRight = getPos().getCol();
                System.out.println("Direção " + direction);
                rectangle.translate((finalColRight-initialRow),0 );
                break;
            case LEFT:
                this.position.setCol(getPos().getCol() - 1);
                int finalColLeft = getPos().getCol();
                System.out.println("Direção " + direction);
                rectangle.translate((finalColLeft-initialRow),0) ;
                break;

        }


    }
}
