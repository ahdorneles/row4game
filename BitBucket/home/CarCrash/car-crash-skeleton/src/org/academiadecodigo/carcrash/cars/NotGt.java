package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Field;
import org.academiadecodigo.carcrash.field.Moves;

/**
 * Created by codecadet on 30/01/17.
 */
public class NotGt extends Car {



    @Override
    public String toString(){
        return "N";
    }

    public void randMove() {
        if (!crashed) {
            if (pos.getRow() > 0) {
                if (pos.movesChoice() == Moves.Up) {
                    pos.setRow(pos.getRow() - 1);
                    pos.setCol(pos.getCol() - 1);
                    System.out.println("UP");
                    return  ;
                }
            }
            if (pos.getRow() < Field.height - 1) {
                if (pos.movesChoice() == Moves.Down) {
                    pos.setCol(pos.getCol() - 1);
                    pos.setRow(pos.getRow() + 1);
                    System.out.println("Down");
                    return  ;
                }
            }

            if (pos.getCol() > 0) {
                if (pos.movesChoice() == Moves.Left || pos.movesChoice() == Moves.Left2 || pos.movesChoice() == Moves.Left3 || pos.movesChoice() == Moves.Left4) {
                    pos.setCol(pos.getCol() - 1);
                    System.out.println("Left");
                    return  ;
                }
            }
            if (pos.getCol() < Field.width - 1) {
                if (pos.movesChoice() == Moves.Right || pos.movesChoice() == Moves.Right2 || pos.movesChoice() == Moves.Right3) {
                    pos.setCol(pos.getCol() + 1);
                    System.out.println("Right");
                    return  ;
                }
            }
        }
    }


}
