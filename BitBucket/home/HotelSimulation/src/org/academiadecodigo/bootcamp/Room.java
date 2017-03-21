package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 25/01/17.
 */
public class Room {
    boolean available;
    private String name;
    private Room[] rooms;

    public Room(String name, boolean available) {
        this.name = name;
        this.available = available;
    }

    public String getName(){
        return name;
    }

    public void setRoomAvailabel(){
        this.available = true;
    }
    public void setRoomUnavailable(){
        this.available = false;
    }

    public boolean getRoomStatus(){
        return available;
    }
}
