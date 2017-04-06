package com.kilobolt.gameworld;

import com.kilobolt.com.kilobolt.gameobjects.Bird;
import com.kilobolt.com.kilobolt.gameobjects.ScrollHandler;
import com.kilobolt.com.kilobolt.zbHelpers.AssetLoader;

/**
 * Created by codecadet on 29/03/17.
 */
public class GameWorld {
    private Bird bird;
    private ScrollHandler scroller;
    private boolean isAlive = true;


    public GameWorld(int midPointY){
        this.bird = new Bird(33, midPointY - 5, 17, 12);
        this.scroller = new ScrollHandler(midPointY + 66);
    }

    public void update(float delta) {
        bird.update(delta);
        scroller.update(delta);

        if (scroller.collides(bird) && isAlive) {
            scroller.stop();
            AssetLoader.dead.play();
            isAlive = false;
        }
    }

    public Bird getBird() {
        return bird;
    }

    public ScrollHandler getScroller() {
        return scroller;
    }
}
