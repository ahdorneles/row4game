package org.academiadecodigo.bootcamp;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by codecadet on 24/02/17.
 */
public class Alarm {
    private Timer timer;

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of times to ring? ");
        int numRings = Integer.parseInt(scanner.next());
        System.out.println("Ring Interval? ");
        int ringInterval = Integer.parseInt(scanner.next());

        Alarm alarm = new Alarm();
        alarm.start(ringInterval, numRings);
        Alarm alarm1 = new Alarm();
        alarm1.start(ringInterval, numRings);

        System.out.println("All alarms are out");
    }

    private void start(int ringInterval, int numRings) {
        this.timer = new Timer();
        timer.scheduleAtFixedRate(new Ring(numRings), ringInterval * 1000, ringInterval * 1000);
    }


    private void stop() {
        timer.cancel();
    }

    private class Ring extends TimerTask {
        int numRings;

        public Ring(int numRings) {
            this.numRings = numRings;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Ring Ring");
            numRings--;

            if (numRings <= 0) {
                System.out.println("Alarm canceled");
                stop();
            }
        }
    }

}
