package com.sda.java8.LinkedList;

public class LinkedList {
    private Node head;

    //Adds new node to the list
    void add(Node node) {
        //Test if null then ...
        //Else: parcurge = head
        //while parcurge has a next element
        //parcurge becomes parcurge.next
        //parcurge.next = node

        if (head == null) {
            head = node;
            return;
        }

        Node parcurge = head;
        while (parcurge.getNextElement() != null) {
            parcurge = parcurge.getNextElement();
        }

        parcurge.setNextElement(node); /*LEGATURA: cea mai importanta chestie din LL*/
    }

    void remove(int value) {

        //exemplu remove last element if lost has 2 elements
//        if (head.getNextElement().getNextElement() == null) {
//            head.setNextElement(null);
//        }

//        for (Node nodCurent = head; nodCurent.getNextElement().getValue() == value; nodCurent = nodCurent.getNextElement()) {
//can t use for bc it is not explicitludoing anythingbesides walking the list

        }
        Node nodCurent = head;
        while (nodCurent.getNextElement() != null && (nodCurent.getNextElement().getValue() == value)) {
            nodCurent = nodCurent.getNextElement();
    }
nodCurent.setNextElement(nodCurent.getNextElement().getNextElement());

    //Display all elements of the list separated by space
    String print() {
        StringBuilder builder = new StringBuilder();
        for (Node nodCurent = head; nodCurent != null; nodCurent = nodCurent.getNextElement()) {
            builder.append(nodCurent.getTip());
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
        if (head == null ){
            return;
        }

        //IF the first element is the value to remove, move the head to the next element
        if(head.getTip() == tip){
            head = head.getNextElement();
            return;
        }

        //Parcurgerea LL-ului pana cand trecem prin toate elemenetele sau pana gasim valuarea.
        Node nodCurent = head;
        while ((nodCurent.getNextElement().getTip() != tip)
                &&
                (nodCurent.getNextElement() != null)) {
            nodCurent = nodCurent.getNextElement();
        }

        //If we didn't find the element, end.
        if(nodCurent.getNextElement() == null){
            return;
        } else {
            //Remove the element
            nodCurent.setNextElement(nodCurent.getNextElement().getNextElement());
        }
    }
}
