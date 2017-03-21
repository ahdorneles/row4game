package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by codecadet on 15/02/17.
 */
public class Reader {
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;


    public Reader() throws IOException {
        this.fileWriter = new FileWriter("/Users/codecadet/Desktop/ProjectsIJ/Paint2ndTry/resources/text");
        this.bufferedWriter = new BufferedWriter(fileWriter);
    }


    public void writer1() throws IOException {
        bufferedWriter.write(1);
    }

    public void writer0() throws IOException {
        bufferedWriter.write(0);
    }

}
