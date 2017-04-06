package org.academiadecodigo.mappings.many2one;

/**
 * Created by tekman on 21/03/2017.
 */
public class Car {

    private Integer id;
    private String name;
    private Owner owner;


    public Car(String name, Owner owner) {
        this.name = name;
        this.owner = owner;
    }

    public Car() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
