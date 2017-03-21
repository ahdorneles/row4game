package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 31/01/17.
 */
public class Tree extends GameObject {
    @Override
    public String toString() {
        return "Tree";
    }
    public Tree(){

    }

    public String getMessage(){
        return "Don't hit the tree";
    }
}
