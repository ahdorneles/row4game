package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 25/01/17.
 */
public class Client {
    private String name;
    boolean stay;
    private int roomNum;
    private Hotel hotel;
    private Client clients;
    private int i;


    Client(String name) {
        this.name = name;
        this.stay = false;
    }

    public boolean getRooms(Hotel hotel) {
        return hotel.availableRooms(this);

    }

    public String getName() {
        return name;
    }

    public void setRoom(int roomNum) {
        this.roomNum = roomNum;

    }

    public int getRoomNum() {
        return roomNum;
    }

    public int checkOut(Hotel hotel) {
        return hotel.leavingRoom(roomNum);
    }


}
