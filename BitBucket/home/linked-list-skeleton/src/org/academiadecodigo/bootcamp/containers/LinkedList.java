package org.academiadecodigo.bootcamp.containers;

public class LinkedList<E> {

    private Node head;
    private int length = 0;

    public LinkedList() {
        this.head = new Node(null);
    }

    public int size() {
        return length;
    }

    /**
     * Adds an element to the end of the list
     *
     * @param data the element to add
     */
    public void add(E  data) {

        Node node = new Node(data);
        Node iterator = head;
        while (iterator.getNext() != null) {
            iterator = iterator.getNext();
        }
        iterator.setNext(node);
        length++;

    }

    /**
     * Obtains an element by index
     *
     * @param index the index of the element
     * @return the element
     */
    public Object get(int index) {
        int counter = 0;
        Node iterator = head.getNext();

        if (index >= size() || index < 0) {
            return null;
        }

        while (counter < index) {
            iterator = iterator.getNext();
            counter++;
        }
        return iterator.getData();

    }

    /**
     * Returns the index of the element in the list
     *
     * @param data element to search for
     * @return the index of the element, or -1 if the list does not contain element
     */
    public int indexOf(E data) {
        Node iterator = head.getNext();
        int index = 0;
        if (iterator == null) {
            return -1;
        }
        while (index < size()) {
            if (iterator.getData() == data) {
                return index;
            }
            iterator = iterator.getNext();
            index++;
        }

        return -1;

    }

    /**
     * Removes an element from the list
     *
     * @param data the element to remove
     * @return true if element was removed
     */
    public boolean remove(E data) {

        Node iterator = head.getNext();
        Node previous = head;
        int index = 0;

        while (index < length) {
            if (iterator.getData() == data) {
                previous.setNext(iterator.getNext());
                length--;
                return true;

            }
            iterator = iterator.getNext();
            previous = previous.getNext();
            index++;
        }
        return false;

    }

    private class Node {

        private E data;
        private Node next;

        public Node(E data) {
            this.data = data;
            next = null;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
