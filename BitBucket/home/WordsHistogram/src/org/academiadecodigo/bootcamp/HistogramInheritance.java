package org.academiadecodigo.bootcamp;

import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by codecadet on 09/02/17.
 */
public class HistogramInheritance extends HashMap<String, Integer> implements Iterable<String> {



    public void add(String str){
        String[] str2 = str.split(" ");
        for(String keys : str2){
            int values = 1;
            if(this.containsKey(keys)){
                values = values + 1;
            }
            this.put(keys, values);
        }


    }
    @Override
    public Iterator<String> iterator() {
        return this.keySet().iterator();
    }


}
