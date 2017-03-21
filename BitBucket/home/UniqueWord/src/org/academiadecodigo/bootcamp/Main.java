package org.academiadecodigo.bootcamp;

import java.util.Iterator;

/**
 * Created by codecadet on 08/02/17.
 */
public class Main {
    public static void main(String[] args) {

        UniqueWord words = new UniqueWord("DRE FRED DRE FRED ALEX");


        System.out.println(words.toString());

        /*words.add("DRE FRED DRE FRED ALEX");*/

       /* Iterator<String> str = words.iterator();

       while (str.hasNext()){
            String i = str.next();
           System.out.println(i);

       }*/

    }
}
