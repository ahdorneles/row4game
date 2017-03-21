package org.academiadecodigo.bootcamp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by codecadet on 07/02/17.
 */
public class Main {
    public static void main(String[] args) {


       Range range = new Range(1,11);


       Iterator<Integer> iteratorTester = range.iterator();




            while (iteratorTester.hasNext()){
                System.out.println(iteratorTester.next());
                iteratorTester.remove();

//                if(i == 5){
//                    iteratorTester.remove();
//                    System.out.println("Removed " + i);
//                }
                //System.out.println(i);
            }

        System.out.println(iteratorTester.next());




    }

}
