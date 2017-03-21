package org;

import java.util.Scanner;

/**
 * Created by codecadet on 22/02/17.
 */
public class Client2 {
    private Scanner scanner;
    private int portNumber;
    private String host;
    private String message;

    public Client2(){

    }



    public void init(){
        this.scanner = new Scanner(System.in);

        System.out.println("Port: ");
        portNumber = Integer.parseInt(scanner.nextLine());

    }

}
