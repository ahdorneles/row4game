package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 25/01/17.
 */
public class Hotel {
    private Client clients;
    private Room[] rooms;
    private Client[] client;
    private Room room;
    private String name;
    private Hotel hotel;

    public Hotel(String name, Room[] rooms) {
        this.name = name;
        this.rooms = rooms;
    }

    public boolean giveRoom(Room room) {
        room.setRoomUnavailable();
        return true;

    }

    public boolean takeRoom(Room room) {
        room.setRoomAvailabel();
        return true;
    }


    public boolean availableRooms(Client clients) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getRoomStatus()) {
                clients.setRoom(i);
                System.out.println(rooms[i].getName() + " is available, go ahead take the key!! MR " + clients.getName() + " With the key: " + clients.getRoomNum());
                giveRoom(rooms[i]);
                return true;
            }
        }
        System.out.println("No rooms available");
        return false;
    }


    public int leavingRoom(int romNum) {
        rooms[romNum].setRoomAvailabel();
        System.out.println(rooms[romNum] + " is free, the following client has left " );
        return 0;
    }

}
