package org;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Created by codecadet on 21/02/17.
 */
public class Address {
    private String name;


    public Address() {
        /*String name = getHost();*/
        String name = "skynet";
        try {
            System.out.println(InetAddress.getByName(name));
            System.out.println(InetAddress.getByName(name).isReachable(null, 100, 5000));

            if (InetAddress.getByName(name).isReachable(4000)) {
                System.out.println(name + " Is on");
                return;
            }
            System.out.println(name + " Off");
            return;
        } catch (UnknownHostException a) {
            System.out.println(a.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String getHost() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Hostname? ");
        return reader.nextLine();
    }


}
