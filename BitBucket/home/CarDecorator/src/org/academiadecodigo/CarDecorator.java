package org.academiadecodigo;

/**
 * Created by codecadet on 14/02/17.
 */
abstract class CarDecorator implements Car {

    private Car car;

    public CarDecorator(Car car){
        this.car = car;
    }

    public int getPrice(){
        return car.getPrice();
    }

    @Override
    public String getAccessories() {
        return car.getAccessories();
    }
}
