package org.academiadecodigo.bootcamp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by codecadet on 09/02/17.
 */
public class Duplicate {

    FileInputStream myFile;
    FileOutputStream newFile;


    public Duplicate(String copy, String paste) throws FileNotFoundException {
        myFile = new FileInputStream(copy);
        newFile = new FileOutputStream(paste);
        //throw new FileNotFoundException("Path to the file doesn't exist");



    }


    public void firstRead() throws IOException {
        byte[] buffer = new byte[1024];
        int num = myFile.read(buffer);
        System.out.println("bytes: " + num);
        while (num != -1) {
            System.out.println("bytes: " + num);

            newFile.write(buffer, 0, num);// data, the start offset in the data, the number of bytes to write.


            num = myFile.read(buffer);


        }

        closeFile();
    }


    public void closeFile() throws IOException {
        myFile.close();
        newFile.close();
    }




}
