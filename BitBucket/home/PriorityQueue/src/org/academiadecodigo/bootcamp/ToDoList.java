package org.academiadecodigo.bootcamp;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * Created by codecadet on 08/02/17.
 */
public class ToDoList implements Iterable<Todo> {



    private PriorityQueue<Todo> priorityQueue;

    public ToDoList(){
        priorityQueue = new PriorityQueue<>();
    }


    public void add(Todo todo){

        priorityQueue.offer(todo);

    }



    public Todo remove(){
        return priorityQueue.poll();
    }

    public Iterator<Todo> iterator() {
        return priorityQueue.iterator();
    }


}
