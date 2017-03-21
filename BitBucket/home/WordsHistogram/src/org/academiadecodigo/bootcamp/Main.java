package org.academiadecodigo.bootcamp;

import java.util.Iterator;

/**
 * Created by codecadet on 09/02/17.
 */
public class Main {
    public static void main(String[] args) {
        HistogramInheritance inheritance = new HistogramInheritance();
        inheritance.add("Bananas Bananas Fred alex alex");
        System.out.println(inheritance);

        HistogramComposition composition = new HistogramComposition();
        composition.add("FRED fred FREED FRED");
        System.out.println(composition);

        Iterator<String> iterator2 = composition.iterator();

        while (iterator2.hasNext()){
            String i = iterator2.next();
            System.out.println(i + " " + composition.get(i));
        }







        /*    Iterator<String> iterator = inheritance.iterator();

        while (iterator.hasNext()){
            String i = iterator.next();
            System.out.println(inheritance.get(iterator.next()));

        }*/
    }
}
