package org.academiadecodigo.bootcamp.threadSynchronization;

/**
 * Created by codecadet on 24/02/17.
 */
public class Worker implements Runnable {


    @Override
    public void run() {
        for (int i = 0; i < 69; i++) {
            try {
                System.out.println("Worker: estou a fazer \"louça\" ....." + i);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Estava na minha hora de cafe.... fs");
                e.printStackTrace();
            }
        }
        System.out.println("Worker: não faço mais um caralho!!!!");
    }
}
