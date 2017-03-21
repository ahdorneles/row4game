package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Field;
import org.academiadecodigo.carcrash.field.Position;

abstract public class Car {
    private Position position;
    private Field field;
    private Car[] cars;
    boolean crashed;

    /**
     * The position of the car on the grid
     */
    Position pos;

    public Car() {
        pos = new Position();
        pos.setCol((int) (Math.random() * Field.width));
        pos.setRow((int) (Math.random() * Field.height));
        randMove();

    }

    public Position getPos() {
        return pos;
    }

    public boolean isCrashed() {
        return crashed;
    }

    public void setCrash() {
        crashed = true;
    }




    public abstract void randMove();



}
