package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Field;
import org.academiadecodigo.carcrash.field.Moves;

/**
 * Created by codecadet on 30/01/17.
 */
public class Gt extends Car {


    @Override
    public String toString() {
        return "G";
    }

     public int moveUp = pos.setRow(pos.getRow() - 1);
    int moveDown = pos.setRow(pos.getRow() + 1);
    int moveLeft = pos.setCol(pos.getCol() -1);
    int moveRight = pos.setCol(pos.getCol() +1);

    public void randMove() {


        if (!crashed) {
            if (pos.getRow() > 0) {
                if (pos.movesChoice() == Moves.Up) {
                    pos.setRow(pos.getRow() - 1);
                    System.out.println("UP");
                    return  ;
                }
            }
            if (pos.getRow() < Field.height - 1) {
                if (pos.movesChoice() == Moves.Down) {
                    pos.setRow(pos.getRow() + 1);
                    System.out.println("Down");
                    return  ;
                }
            }

            if (pos.getCol() > 0) {
                if (pos.movesChoice() == Moves.Left) {
                    pos.setCol(pos.getCol() - 1);
                    System.out.println("Left");
                    return  ;
                }
            }
            if (pos.getCol() < Field.width - 1) {
                if (pos.movesChoice() == Moves.Right) {
                    pos.setCol(pos.getCol() + 1);
                    System.out.println("Right");
                    return  ;
                }
            }



        }

    }


}
