package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 27/02/17.
 */
public class Main {

    public static void main(String[] args) {
        Machine machine = new Machine(20);
        Person person = new Person(machine);
        Person person2 = new Person(machine);



        Thread machinThread = new Thread(machine);
        machinThread.setName("machine");

        Thread personThread = new Thread(person);
        personThread.setName("Person");

        Thread person2Thread = new Thread(person2);
        person2Thread.setName("Person2");

        machinThread.start();
        personThread.start();
        person2Thread.start();

    }
}
