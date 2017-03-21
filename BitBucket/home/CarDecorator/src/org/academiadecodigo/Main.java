package org.academiadecodigo;

/**
 * Created by codecadet on 14/02/17.
 */
public class Main {

    public static void main(String[] args) {
        BasicCar car1 = new BasicCar();
        car1.getPrice();

        Car car = new Gps(new RedColor(car1));



        car.getPrice();
        car.getAccessories();


    }
}
