package org.academiadecodigo.bootcamp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * Created by codecadet on 25/02/17.
 */
public class WebServer {


    private ServerSocket serverSocket;
    public static final String DOCUMENT_ROOT = "www/";


    public void start() {

        try {
            ExecutorService pool = Executors.newFixedThreadPool(4);
            serverSocket = new ServerSocket(9999);
            while (true) {
                pool.submit(new Client(serverSocket.accept()));
                /*Thread thread = new Thread(new Client(serverSocket.accept()));
                thread.start();*/

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
