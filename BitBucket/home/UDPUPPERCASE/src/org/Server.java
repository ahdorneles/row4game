package org;

import java.io.IOException;

import java.net.*;
import java.util.Scanner;


public class Server {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Port: ");
        int portNumber = Integer.parseInt(scanner.nextLine());


        DatagramSocket socket = new DatagramSocket(portNumber);

        while (true) {
            byte[] recvBuffer = new byte[1024];
            byte[] sendBuffer;


            DatagramPacket receivedPacket = new DatagramPacket(recvBuffer, recvBuffer.length);

            try {
                socket.receive(receivedPacket);
            } catch (IOException e) {
                e.printStackTrace();
            }

            String clientMessage = new String(receivedPacket.getData(), 0, receivedPacket.getLength());
            System.out.println("Message received: " + clientMessage);

            String upperClientMessage = clientMessage.toUpperCase();

            InetAddress ipAddress = receivedPacket.getAddress();

            int port = receivedPacket.getPort();

            sendBuffer = upperClientMessage.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, ipAddress, port);
            socket.send(sendPacket);

        }
    }
}