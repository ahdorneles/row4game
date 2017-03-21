package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 22/01/17.
 */

import java.util.Arrays;

public class Player {
    private String name;
    private int[] guessArray = new int[15];
    private int counter = 0;

    public Player(String name) {
        this.name = name;

    }

    public int guess(int minNum, int maxNum) {
        int temp = (int) (Math.random() * ((maxNum - minNum) + 1) + minNum);
        for (int i = 0; i < guessArray.length; i++) {
            if (temp == guessArray[i]) {
                return guess(minNum, maxNum);

            }
        }

        guessArray[counter] = temp;
        counter++;
        //  System.out.println(Arrays.toString(guessArray));
        return temp;
    }

    public String getName() {
        return name;
    }


}
