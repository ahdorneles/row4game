package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.gameObject.Avatar;
import org.academiadecodigo.bootcamp.grid.GridDirection;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codecadet on 06/02/2017.
 */
public class Player implements KeyboardHandler {
    private Avatar avatar;
    private String name;
    private boolean stageCleared;
    private KeyboardHandler keyboardHandler;
    private List<Avatar> avatars = new ArrayList<>();

    public Player(String name, Avatar avatar) {
        this.name = name;
        this.avatar = avatar;
        avatars.add(avatar);
        Keyboard k = new Keyboard(this);
        KeyboardEvent eventUp = new KeyboardEvent();
        eventUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        eventUp.setKey(KeyboardEvent.KEY_UP);
        k.addEventListener(eventUp);
        KeyboardEvent eventDown = new KeyboardEvent();
        eventDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        eventDown.setKey(KeyboardEvent.KEY_DOWN);
        k.addEventListener(eventDown);
        KeyboardEvent eventRight = new KeyboardEvent();
        eventRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        eventRight.setKey(KeyboardEvent.KEY_RIGHT);
        k.addEventListener(eventRight);
        KeyboardEvent eventLeft = new KeyboardEvent();
        eventLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        eventLeft.setKey(KeyboardEvent.KEY_LEFT);
        k.addEventListener(eventLeft);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_UP:
                avatar.setDirection(GridDirection.UP);

                break;
            case KeyboardEvent.KEY_DOWN:
                avatar.setDirection(GridDirection.DOWN);
                break;
            case KeyboardEvent.KEY_RIGHT:
                avatar.setDirection(GridDirection.RIGHT);
                break;
            case KeyboardEvent.KEY_LEFT:
                avatar.setDirection(GridDirection.LEFT);
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    }
}

