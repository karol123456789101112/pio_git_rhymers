package edu.kis.vh.nursery.list;


/**
 * Klasa posiada stałą typu integer 'VALUE' i dwa pola: prev i next - instancje klasy 'Node'
 * jak i również metody getNext(), setNext(), getPrev(), setPrev(), getVALUE()
 */
public class Node {

    private final int VALUE;
    private Node prev;
    private Node next;

    /**
     *
     * @param i jest przypisywany do stałej 'VALUE'
     */
    public Node(int i) {
        VALUE = i;
    }

    /**
     *
     * @return zwraca obiekt 'next'
     */
    public Node getNext() {
        return next;
    }

    /**
     *
     * @param next jest przekazywany do metody setNext() w celu ustawienia referencji na kolejny element
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     *
     * @return zwraca obiekt 'prev'
     */
    public Node getPrev() {
        return prev;
    }

    /**
     *
     * @param prev jest przekazywany do metody setPrev() w celu ustawienia referencji na kolejny element
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }

    /**
     *
     * @return zwraca wartość 'VALUE'
     */
    public int getVALUE() {
        return VALUE;
    }
}
