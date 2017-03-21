package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 24/02/17.
 */
public class ThreadLauncher {
    public static void main(String[] args) {

        Thread2nd thread2 = new Thread2nd();

        thread2.run();

        Thread thread3 = new Thread(thread2);

        thread3.start();

        for (int i = 0; i < 10 ; i++) {
            Thread thread = new Thread(new Thread2nd());
            thread.setName("My thread" + i);
            thread.start();
        }
    }
}
