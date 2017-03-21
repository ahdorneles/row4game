package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 08/02/17.
 */
public class Todo implements Comparable<Todo> {
    private int importance;
    private PriorityType priorityType;
    private String name;

    public Todo(PriorityType priorityType, int importance, String name) {
        this.name = name;
        this.priorityType = priorityType;
        this.importance = importance;
    }


    public int getImportance() {
        return importance;
    }

    public int getPriorityType() {
        int number = priorityType.getPriorityNumber();
        return number;
    }


    @Override
    public String toString() {
        return name;
    }


    @Override
    public int compareTo(Todo o) {
        if (this.getPriorityType() == o.getPriorityType()) {
            if (this.getImportance() > o.getImportance()) {
                return -1;

            } else if (this.getImportance() < o.getImportance()) {
                return 1;

            } else {
                return 0;
            }

        }
        if (this.getPriorityType() > o.getPriorityType()) {
            return -1;
        }

        return 1;
    }


}
