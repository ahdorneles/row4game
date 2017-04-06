package org.academiadecodigo.mappings.inheritance;

/**
 * Created by tekman on 21/03/2017.
 */
public class Car extends Vehicle {

    private Integer gears;

    public Car(String name, Integer speed, Integer gears) {
        super(name, speed);
        this.gears = gears;
    }

    public Car() {
    }

    public Integer getGears() {
        return gears;
    }

    public void setGears(Integer gears) {
        this.gears = gears;
    }
}
