package org;

import java.io.*;
import java.net.URL;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Created by codecadet on 21/02/17.
 */
public class Curl {
    private URL url;
    private BufferedReader bufferedReader;
    private String line;
    private String name;
    private String result;


    public Curl() {
/*
        name = "http://" + getHost();
*/
        this.name = "http://www.publico.pt";
        try {
            this.url = new URL(name);
            InputStreamReader url1 = new InputStreamReader(url.openStream());
            this.bufferedReader = new BufferedReader(url1);

            while((line = bufferedReader.readLine()) != null) {
                result += line + "\n";
                System.out.println(line);
            }
/*
            System.out.println(result);
*/

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (bufferedReader != null){
                try{
                    bufferedReader.close();
                }
                catch (IOException e){
                    e.getMessage();
                }
            }
        }
    }
    public String getHost() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Hostname? ");
        return reader.nextLine();
    }
}
