package org.academiadecodigo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by codecadet on 22/02/17.
 */
public class Server {
    private PrintWriter out;
    private BufferedReader in;


    public void startServer() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Port: ");
        int port = Integer.parseInt(scanner.nextLine());

          /*  System.out.println("Message: ");
            String message = scanner.nextLine();*/


        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(port);

            Socket clientSocket = serverSocket.accept();


            this.out = new PrintWriter(clientSocket.getOutputStream(), true);

            this.in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        } catch (IOException e) {
            e.printStackTrace();
        }

        while (true) {


            try {

                String message = in.readLine();
                System.out.println(message);

            } catch (IOException e) {
                e.printStackTrace();
            }


        }


    }

    public static void main(String[] args) {
        Server server = new Server();

        server.startServer();

    }


}
