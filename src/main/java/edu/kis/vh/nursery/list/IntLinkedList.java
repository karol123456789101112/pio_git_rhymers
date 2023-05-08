package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int DEFAULT_RETURN_VALUE = -1;
    private Node last;
    private int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().prev = last;
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return DEFAULT_RETURN_VALUE;
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return DEFAULT_RETURN_VALUE;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }
}
