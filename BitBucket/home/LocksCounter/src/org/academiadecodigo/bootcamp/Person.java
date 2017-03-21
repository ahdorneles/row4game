package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 27/02/17.
 */
public class Person implements Runnable {

    private Machine machine;

    public Person(Machine machine) {
        this.machine = machine;

    }


    @Override
    public void run() {
        synchronized (machine) {
            while (machine.getActual() < machine.getMax()) {
                try {
                    System.out.println(Thread.currentThread().getName() + " Actual: " + machine.getActual());
                    machine.incrementActual();
                    machine.notifyAll();
                    machine.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
