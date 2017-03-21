package org.academiadecodigo.bootcamp.containers;

import java.util.*;
import java.util.LinkedList;

/**
 * Created by codecadet on 07/02/17.
 */
public class Main {
    public static void main(String[] args) {

        List linkedList = new LinkedList();


        for (int i = 0; i < 10; i++) {

            if (i > 7) {
                linkedList.add(new Car());

            }

        }






        System.out.println(linkedList);

        List<String> lst = new ArrayList<String>();
        lst.add("alpha");
        lst.add("beta");
        lst.add("charlie");

        System.out.println(lst);

        System.out.println("hahshhash " +  lst.get(0));
// Retrieve the Iterator associated with this List
        Iterator<String> iter = lst.iterator();




// Transverse this List using the Iterator
        while (iter.hasNext()) {

            // Retrieve each element and process
            String str = iter.next();
            System.out.println(str);

            // Iterators allow safe removal while iterating
            iter.remove();

        }


    }
}
