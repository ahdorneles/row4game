package org.academiadecodigo.bootcamp;

import java.io.IOException;

/**
 * Created by codecadet on 14/02/17.
 */
public class Main {
    public static void main(String[] args) {


        try {
            Grid grid = new Grid(10, 10);
            grid.init();
            grid.saving();


        }
        catch (IOException a){
            System.out.println(a.getMessage());
        }

    }
}
