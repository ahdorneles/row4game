package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 25/01/17.
 */

public class Main {
    public static void main(String[] args) {
        int numRooms = 2;
        int numClients = 2;


        Room[] rooms = new Room[numRooms];

        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room("Room" + (i+1), true);
        }

        Client[] clients = new Client[numClients];

        for (int j = 0; j < clients.length; j++) {
            clients[j] = new Client("Client" + (j+1));
        }

        Hotel hotel1 = new Hotel("Fred's Hotel",rooms);




        System.out.println(rooms[0].getName() + " is available " + rooms[0].getRoomStatus());
        System.out.println(rooms[1].getName() + " is available " + rooms[1].getRoomStatus());
        clients[0].getRooms(hotel1);
        clients[1].getRooms(hotel1);
        System.out.println(rooms[0].getName() + " is available " + rooms[0].getRoomStatus());
        System.out.println(rooms[1].getName() + " is available " + rooms[1].getRoomStatus());
        clients[0].checkOut(hotel1);
        System.out.println(rooms[0].getName() + " is available " + rooms[0].getRoomStatus());
        System.out.println(rooms[1].getName() + " is available " + rooms[1].getRoomStatus());




    }
}
