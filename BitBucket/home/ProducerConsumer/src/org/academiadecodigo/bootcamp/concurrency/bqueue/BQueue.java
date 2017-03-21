package org.academiadecodigo.bootcamp.concurrency.bqueue;

import java.util.LinkedList;

/**
 * Blocking Queue
 *
 * @param <T> the type of elements stored by this queue
 */
public class BQueue<T> {
    private int limit;
    private LinkedList<T> linkedList;

    /**
     * Constructs a new queue with a maximum size
     *
     * @param limit the queue size
     */
    public BQueue(int limit) {
        this.limit = limit;
        this.linkedList = new LinkedList<>();


    }

    /**
     * Inserts the specified element into the queue
     * Blocking operation if the queue is full
     *
     * @param data the data to add to the queue
     */
    public void offer(T data) {
        synchronized (this) {
            while (linkedList.size() >= limit) {
                System.out.println("Can't add  more elements");
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            linkedList.add(data);
            this.notifyAll();
            System.out.println("Added element:  " + data);
            System.out.println(this.getSize());

        }
    }

    /**
     * Retrieves and removes data from the head of the queue
     * Blocking operation if the queue is empty
     *
     * @return the data from the head of the queue
     */
    public T poll() {
        synchronized (this) {
            while (linkedList.size() <= 0) {
                System.out.println("The queue list is empty");
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


            T polled = linkedList.poll();
            System.out.println("Consumed element: " + polled);
            System.out.println(this.getSize());
            this.notifyAll();
            return polled;


        }

    }

    /**
     * Gets the number of elements in the queue
     *
     * @return the number of elements
     */
    public int getSize() {
        System.out.println("Queue size: " + linkedList.size());
        return linkedList.size();


    }

    /**
     * Gets the maximum number of elements that can be present in the queue
     *
     * @return the maximum number of elements
     */
    public int getLimit() {
        return limit;
    }

}
