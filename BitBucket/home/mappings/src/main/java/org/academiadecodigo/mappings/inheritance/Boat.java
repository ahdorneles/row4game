package org.academiadecodigo.mappings.inheritance;

/**
 * Created by tekman on 21/03/2017.
 */
public class Boat extends Vehicle {

    private Integer engines;

    public Boat() {
    }

    public Boat(String name, Integer speed, Integer engines) {
        super(name, speed);
        this.engines = engines;
    }

    public Integer getEngines() {
        return engines;
    }

    public void setEngines(Integer engines) {
        this.engines = engines;
    }

}
