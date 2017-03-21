package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 24/01/17.
 */
public class Player {
    private String name;
    private int[] memory;


    public Player(String name) {
        this.name = name;

    }

    public int pickNumber(int min, int max) {
        if (memory == null) {
            memory = new int[max - min + 1];

            for (int i = 0; i < memory.length; i++) {
                memory[i] = min - 1;
            }
        }

        int number = min -1;
        boolean match = false;

        while (!match) {
            number = RandomGeneratot.random(min, max);

            for (int i = 0; i < memory.length; i++) {

                if (number == memory[i]) {
                    break;
                }
                if (memory[i] == min -1) {
                    memory[i] = number;
                    match = true;
                    break;
                }

            }

        }

        return number;
    }

    public String getName() {
        return name;
    }
}
