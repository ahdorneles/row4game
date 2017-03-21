package org.academiadecodigo.bootcamp;

import java.io.*;
import java.net.DatagramPacket;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by codecadet on 23/02/17.
 */
public class WebServer {
    ServerSocket serverSocket = null;
    private BufferedReader inData;
    private FileInputStream fileInputStream;

    private DataOutputStream outData;
    private Socket clientSocket;
    private ArrayList pages;
    private File file;


    public void starServer() throws IOException {
        pages = new ArrayList();
        String page1 = "/index.html";
        pages.add(page1);

        serverSocket = new ServerSocket(9090);

        while (true) {
            this.clientSocket = serverSocket.accept();

            this.inData = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            this.outData = new DataOutputStream(clientSocket.getOutputStream());

            readHeader();

        }

    }

    public void readHeader() {
        byte[] buffer = new byte[2048];
        try {


            String line = inData.readLine();
            String[] firsLine = line.split(" ");
            System.out.println(firsLine[0]);


            if (firsLine[0].contains("GET")) {
                System.out.println();


                if (firsLine[1].equals("/earth.gif")) {
                    System.out.println("I am in earth");
                    fileInputStream = new FileInputStream("www/earth.gif");
                    file = new File("www/earth.gif");
                    long fileSize = file.length();


                    outData.writeBytes(StatusCode.image(fileSize, "gif"));

                    while (fileInputStream.read(buffer) != -1) {
                        outData.write(buffer);
                    }
                    outData.flush();
                    return;


                } else if (firsLine[1].equals("/") || firsLine[1].equals("/index.html")) {
                    System.out.println("i m in root");
                    fileInputStream = new FileInputStream("/Users/codecadet/Desktop/ProjectsIJ/SimpleWebServer/www/index.html");
                    file = new File("/Users/codecadet/Desktop/ProjectsIJ/SimpleWebServer/www/index.html");
                    long fileSize = file.length();

                    outData.writeBytes(StatusCode.text(fileSize));

                    while (fileInputStream.read(buffer) != -1) {
                        outData.write(buffer);
                    }
                    outData.flush();
                    return;

                } else {
                    System.out.println("I am in 404");
                    fileInputStream = new FileInputStream("www/404.html");
                    file = new File("www/404.html");
                    long fileSize = file.length();

                    outData.writeBytes(StatusCode.notFound(fileSize));

                    while (fileInputStream.read(buffer) != -1) {
                        outData.write(buffer);
                    }
                    outData.flush();
                    return;

                }
            }
////////////////////////////

        } catch (IOException e1) {
            e1.printStackTrace();
        }


    }



}
