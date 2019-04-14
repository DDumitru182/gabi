package com.sda.java8.LinkedList;

public class DoubleLinkedList {
    private DoubleLinkedNode head;
    private DoubleLinkedNode tail;

    //Adds new node to the list
    void add(DoubleLinkedNode node) {
        //Test if null then ...
        //Else: parcurge = head
        //while parcurge has a next element
        //parcurge becomes parcurge.next
        //parcurge.next = node

        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.setNextElement(node);
        node.setPreviousElement(tail);
        tail = node;
    }


//        parcurge.setNextElement(node); /*LEGATURA: cea mai importanta chestie din LL*/


    //Display all elements of the list separated by space
    String print() {
        StringBuilder builder = new StringBuilder();
        for (DoubleLinkedNode nodCurent = head; nodCurent != null; nodCurent = nodCurent.getNextElement()) {
            builder.append(nodCurent.getValue());
            builder.append(" ");
        }
        return builder.toString();
    }

    String printReverse() {
        StringBuilder builder = new StringBuilder();
        for (DoubleLinkedNode nodCurent = tail; nodCurent != null; nodCurent = nodCurent.getPreviousElement()) {
            builder.append(nodCurent.getValue());
            builder.append(" ");
        }
        return builder.toString();
    }

    void remove(int value) {
        //Example de remove last element if list contains only 2 values
//        Node penultimul = head;
//        if (penultimul.getNextElement().getNextElement() == null){
//            penultimul.setNextElement(null);
//        }
        //WE can't use the for because it's not explicitly doing anything besides walking the list
//        for(Node nodCurent = head; nodCurent.getNextElement().getTip() == tip; nodCurent = nodCurent.getNextElement()){
//        }

        //If the list is empty, STOP.
        if (head == null) {
            return;
        }

        if(head.getValue() == value && head.getNextElement() == null){
            head = null;
            tail = null;
            return;
        }

        //IF the first element is the value to remove, move the head to the next element
        if (head.getValue() == value) {
            head = head.getNextElement();
            if (head != null) {
                head.setPreviousElement(null);
            }
            return;
        }

        //If the last elemeent is the value to remove, move the tail to the previous element
        if (tail.getValue() == value) {
            tail = tail.getPreviousElement();
            tail.setNextElement(null);
            return;
        }

        //Parcurgerea LL-ului pana cand trecem prin toate elemenetele sau pana gasim valuarea.
        DoubleLinkedNode nodCurent = head;
        while ((nodCurent.getNextElement().getValue() != value)
                &&
                (nodCurent.getNextElement() != null)) {
            nodCurent = nodCurent.getNextElement();
        }


        //If we didn't find the element, end.
        if (nodCurent.getNextElement() == null) {
            return;
        }
        //Remove the element
        nodCurent.setNextElement(nodCurent.getNextElement().getNextElement());
        nodCurent.getNextElement().setPreviousElement(nodCurent);
    }
}

