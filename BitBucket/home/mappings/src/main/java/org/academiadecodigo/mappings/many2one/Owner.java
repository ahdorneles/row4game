package org.academiadecodigo.mappings.many2one;

/**
 * Created by tekman on 21/03/2017.
 */
public class Owner {

    private Integer id;
    private String name;

    public Owner(String name) {
        this.name = name;
    }


    public Owner() {
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
}
