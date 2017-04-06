package org.academiadecodigo.mappings.inheritance;

/**
 * Created by tekman on 21/03/2017.
 */
public abstract class Vehicle {

    private String name;
    private Integer id;
    private Integer speed;


    public Vehicle() {
    }


    public Vehicle(String name, Integer speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
}
