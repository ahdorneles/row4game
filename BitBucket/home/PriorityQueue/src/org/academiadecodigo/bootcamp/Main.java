package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 08/02/17.
 */
public class Main {

    public static void main(String[] args) {
        ToDoList list = new ToDoList();
        Todo todo1 = new Todo(PriorityType.LOW, 1 , "Low");
        Todo todo2 = new Todo(PriorityType.HIGH, 1 , "High");
        Todo todo3 = new Todo(PriorityType.MEDIUM, 1 , "Medium");
        Todo todo4 = new Todo(PriorityType.MEDIUM, 2 , "Medium2");



        list.add(todo1);
        list.add(todo2);
        list.add(todo3);
        list.add(todo4);

        for (Todo todo : list) {
            System.out.println(todo);
        }

        System.out.println("-------");

        for (int i = 0; i < 4; i++) {
            System.out.println(list.remove());
        }

    }
}
