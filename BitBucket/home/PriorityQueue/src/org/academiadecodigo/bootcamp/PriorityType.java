package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 08/02/17.
 */
public enum PriorityType {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private int priorityNumber;

    PriorityType(int priorityNumber) {
        this.priorityNumber = priorityNumber;
    }

    public int getPriorityNumber() {
        return priorityNumber;
    }
}
