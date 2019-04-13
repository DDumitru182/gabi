package com.sda.java8.LinkedList;

public class Node {
    private final int tip;
    private Node nextElement;

    public Node(int tip) {
        this.tip = tip;
    }

    public int getTip() {
        return tip;
    }

    public Node getNextElement() {
        return nextElement;
    }

    public void setNextElement(Node nextElement) {
        this.nextElement = nextElement;
    }
}
