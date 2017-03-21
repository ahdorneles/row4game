package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 24/02/17.
 */
public class Thread2nd implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }


}
