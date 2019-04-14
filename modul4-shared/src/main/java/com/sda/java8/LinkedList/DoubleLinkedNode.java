package com.sda.java8.LinkedList;

public class DoubleLinkedNode{
    private final int value;
    private DoubleLinkedNode nextElement;

    public DoubleLinkedNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public DoubleLinkedNode getNextElement() {
        return nextElement;
    }

    public void setNextElement(DoubleLinkedNode nextElement) {
        this.nextElement = nextElement;
    }
}