package org.academiadecodigo.bootcamp;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by codecadet on 09/02/17.
 */
public class Main {
    public static void main(String[] args) {

        try {
            Duplicate duplicate = new Duplicate("files/carmen-mirandas-108th-birthday-6367640367923200-hp.jpg", "files/newtestimage.jpg");
            duplicate.firstRead();
            Duplicate duplicate1 = new Duplicate("files/test.txt", "files/newtest2.txt");
            duplicate1.firstRead();
          //  duplicate.pasteFile();
/*
            duplicate.closeFile();
*/


        } catch (FileNotFoundException a) {
            System.out.println(a.getMessage());
        } catch (IOException b) {
            System.out.println(b.getMessage());
        }
    }
}
