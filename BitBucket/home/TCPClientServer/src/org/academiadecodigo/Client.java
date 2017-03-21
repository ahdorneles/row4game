package org.academiadecodigo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Created by codecadet on 22/02/17.
 */
public class Client {
    private PrintWriter out;
    private BufferedReader in;


    public void startClient() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Host: ");
        String host = scanner.nextLine();

        System.out.println("Port: ");
        int port = Integer.parseInt(scanner.nextLine());

        System.out.println("Message: ");
        String message = scanner.nextLine();


        try {

            Socket clientSocket = new Socket(host, port);

            this.out = new PrintWriter(clientSocket.getOutputStream(), true);

            this.in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        }
        catch (IOException e) {
            e.printStackTrace();
        }


        while (true) {


            out.println(message);
            //in.readLine();
            message = scanner.nextLine();


        }
    }

    public static void main(String[] args) {
        Client client = new Client();

        client.startClient();


    }
}
