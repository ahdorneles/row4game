package org.academiadecodigo.carcrash;

import org.academiadecodigo.carcrash.cars.Car;
import org.academiadecodigo.carcrash.cars.CarFactory;
import org.academiadecodigo.carcrash.field.Field;

public class Game {

    public static final int MANUFACTURED_CARS = 40;

    /** Graphical Car Field */
    private Field field;

    /** Container of Cars */
    private Car[] cars;
    private Car car;

    /** Animation delay */
    private int delay;

    public Game(int cols, int rows, int delay) {

        Field.init(cols, rows);
        this.delay = delay;

    }


    /**
     * Creates a bunch of cars and randomly puts them in the field
     */
    public void init() {

        cars = new Car[MANUFACTURED_CARS];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = CarFactory.getNewCar();
        }

        Field.draw(cars);

    }

    /**
     * Starts the animation
     *
     * @throws InterruptedException
     */
    public void start() throws InterruptedException {

        while (true) {

            // Pause for a while
            Thread.sleep(delay);

            for(int i = 0; i < cars.length; i++){
                for( int j = 0; j < cars.length; j ++){
                    Car cars1 = cars[i];
                    Car cars2 = cars[j];
                    if(cars1 != cars2) {
                        if (cars1.getPos().crashed(cars2.getPos())) {
                            cars1.setCrash();
                            cars2.setCrash();
                        }
                    }

                }
            }
            // Move all cars
            moveAllCars();

            // Update screen
            Field.draw(cars);



        }

    }

    private void moveAllCars() {
        for(int i = 0; i < cars.length; i++){
            cars[i].randMove();

        }

    }

}
