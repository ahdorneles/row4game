package org;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Created by codecadet on 21/02/17.
 */
public class Client {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Port: ");
        int portNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Host: ");
        String host = scanner.nextLine();

        System.out.println("Message: ");
        String message = scanner.nextLine();


        byte[] recvBuffer = new byte[1024];
        byte[] sendBuffer;

        DatagramSocket socket = new DatagramSocket();

        sendBuffer = message.getBytes();

        DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, InetAddress.getByName(host), portNumber);

        socket.send(sendPacket);

        DatagramPacket receivedPacket = new DatagramPacket(recvBuffer, recvBuffer.length);

        socket.receive(receivedPacket);

        String upperClientMessage = new String(receivedPacket.getData(), 0, receivedPacket.getLength());
        System.out.println("Message UpperCase from server: " + upperClientMessage);

        socket.close();


    }
}