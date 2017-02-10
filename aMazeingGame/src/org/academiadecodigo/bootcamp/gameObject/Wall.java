package org.academiadecodigo.bootcamp.gameObject;

import org.academiadecodigo.bootcamp.grid.position.SimpleGfxGridPosition;

/**
 * Created by codecadet on 06/02/2017.
 */
public class Wall extends GameObject {

    private SimpleGfxGridPosition position;

    public SimpleGfxGridPosition getPosition() {
        return position;
    }

    public void setPosition(SimpleGfxGridPosition position) {
        this.position = position;
    }
}
