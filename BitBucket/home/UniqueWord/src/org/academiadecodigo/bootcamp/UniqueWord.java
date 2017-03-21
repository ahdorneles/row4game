package org.academiadecodigo.bootcamp;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by codecadet on 08/02/17.
 */
public class UniqueWord implements Iterable<String> {
    private HashSet<String> hashSet;

    public UniqueWord(String words){
    this.hashSet = new HashSet();
        String[]words2 = words.split(" ");
        for (int i = 0; i < words2.length ; i++) {
            hashSet.add(words2[i]);
        }
    }

    @Override
    public Iterator<String> iterator() {
        return hashSet.iterator();
    }





    @Override
    public String toString() {
        return String.valueOf(hashSet);
    }
}
