package org.academiadecodigo.bootcamp;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by codecadet on 09/02/17.
 */
public class HistogramComposition implements Iterable<String> {

    private HashMap<String, Integer> hashMap;

    public HistogramComposition(){
        this.hashMap = new HashMap();

    }

   public void add(String str){
        String[] str2 = str.split(" ");
       for(String keys : str2){
           int values = 1;
           if(hashMap.containsKey(keys)){
               values = values + 1;
           }
           hashMap.put(keys, values);

       }


    }

    public int size(){
        return hashMap.size();
    }

    public int get(String word){
        return  hashMap.get(word);
    }




    @Override
    public Iterator<String> iterator() {
        return hashMap.keySet().iterator();
    }




}
