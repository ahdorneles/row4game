package org.academiadecodigo.bootcamp.game;

import org.academiadecodigo.bootcamp.Player;
import org.academiadecodigo.bootcamp.gameObject.Avatar;
import org.academiadecodigo.bootcamp.gameObject.GameObject;
import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.grid.Level;
import org.academiadecodigo.bootcamp.grid.SimpleGfxGrid;
import org.academiadecodigo.bootcamp.grid.position.SimpleGfxGridPosition;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import sun.jvm.hotspot.runtime.Thread;

import java.util.*;

/**
 * Created by codecadet on 06/02/2017.
 */
public class Game {

    private int delay;
    private SimpleGfxGrid grid;
    private Avatar avatar;
    private CollisionDetector collider;
    private boolean runningGame = true;
    private Level level;
    private GameObject[] gameObjects;
    private ArrayList<Avatar> avatarList = new ArrayList<>();


    public Game(int delay) {/// not sure if needs it
        this.delay = delay;
    }

    public void init() {

        grid = new SimpleGfxGrid(20,20);
        Rectangle rectangle = new Rectangle(grid.getPADDING(), grid.getPADDING(), grid.getCELL_SIZE() * grid.getCols(), grid.getCELL_SIZE() * grid.getRows());
        rectangle.setColor(Color.BLUE);
        rectangle.draw();

        CollisionDetector collisionDetector = new CollisionDetector();
        //GameObject[] gameObjects = new GameObject[];
        grid.init(Level.LEVEL_1.getLevel());


    }

    public void start() throws InterruptedException {

        while (runningGame == true) {
            java.lang.Thread.sleep(delay);

          /*  moveAvatar();*/
        }

    }

  /*  public void moveAvatar() {

        if (!collider.collided()) {

        }*/

    }

