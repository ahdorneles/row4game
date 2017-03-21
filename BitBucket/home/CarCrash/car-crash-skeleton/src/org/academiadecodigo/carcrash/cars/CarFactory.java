package org.academiadecodigo.carcrash.cars;

public class CarFactory {

    public static Car getNewCar() {
        int ranCar = (int) (Math.random() * 2);
        if (ranCar == 0) {
            return new NotGt();
        }
        if (ranCar == 1) {
            return new NotGt();
        }

        return null;
    }
}
