package org.academiadecodigo.bootcamp;

import java.io.IOException;

/**
 * Created by codecadet on 24/02/17.
 */
public class Main {
    public static void main(String[] args) {
        try {
            WebServer webServer = new WebServer();
            webServer.starServer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
