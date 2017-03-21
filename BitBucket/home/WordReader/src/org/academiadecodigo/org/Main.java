package org.academiadecodigo.org;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by codecadet on 13/02/17.
 */
public class Main {
    public static void main(String[] args) {

        try

        {
            WordReader reader = new WordReader("/Users/codecadet/Desktop/ProjectsIJ/WordReader/resources/text.txt");

            //reader.getResult();



        } catch (IOException a) {
            System.out.println(a.getMessage());
        }




    }
}
