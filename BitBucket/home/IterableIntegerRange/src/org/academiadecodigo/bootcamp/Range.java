package org.academiadecodigo.bootcamp;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by codecadet on 07/02/17.
 */
public class Range implements Iterable<Integer> {
    private int min;
    private int max;
private List<Integer> removed;
    private  boolean reversed;

    public Range(int min, int max) {
        this.min = min;
        this.max = max;
        removed = new LinkedList<>();
    }




    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator();
    }


    public class MyIterator implements Iterator<Integer> {


        private int counter;

        public MyIterator() {
            this.counter = min;
        }

        @Override
        public boolean hasNext() {
            if (counter > max) {
                return false;
            }
            return true;
        }

        @Override
        public Integer next() {
            if (this.hasNext()) {
                return counter++;
            }
            throw new NoSuchElementException();
        }

        @Override
        public void remove() {
            if (counter < min){
                throw new IllegalStateException();
            }


        }
    }
}