package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 24/01/17.
 */
public class RandomGeneratot {
    public static int random(int min, int max){
        return  (int) (Math.random() * (max-min +1) + min);

    }
}
