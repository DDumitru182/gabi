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

    void remove(int tip) {
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

        //IF the first element is the value to remove, move the head to the next element
        if (head.getValue() == tip) {
            head = head.getNextElement();
            return;
        }

        //Parcurgerea LL-ului pana cand trecem prin toate elemenetele sau pana gasim valuarea.
        DoubleLinkedNode nodCurent = head;
        while ((nodCurent.getNextElement().getValue() != tip)
                &&
                (nodCurent.getNextElement() != null)) {
            nodCurent = nodCurent.getNextElement();
        }

        //If we didn't find the element, end.
        if (nodCurent.getNextElement() == null) {
            return;
        } else {
            //Remove the element
            nodCurent.setNextElement(nodCurent.getNextElement().getNextElement());
        }
    }
}

