package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 27/02/17.
 */
public class Machine implements Runnable {

    private int actual;
    private final int max;

    public Machine(int max) {
        this.max = max;
        this.actual = 0;
    }

    @Override
    public void run() {
        synchronized (this) {
            while (actual < max) {
                try {
                    System.out.println(Thread.currentThread().getName() + " Actual: " + actual);
                    actual++;
                    notifyAll();
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void incrementActual(){
        actual ++;
    }

    public int getActual() {
        return actual;
    }

    public int getMax() {
        return max;
    }
}
