package org.academiadecodigo.bootcamp.threadSynchronization;

/**
 * Created by codecadet on 24/02/17.
 */
public class Manager {

    public static void main(String[] args) {

        try {
            Thread thread = new Thread(new Worker());
            System.out.println("Agarrem-se ao trabalho!!");
            thread.start();
            thread.join();
            System.out.println("Manager: Que lindos caralhos!");




        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Ainda faltam caralhos");
        }
    }

}
