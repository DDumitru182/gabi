package com.sda.java8.LinkedList;

public class LinkedList {
    private Node head;

    //Adds new node to the list
    void add(Node node){
        //Test if null then ...
        //Else: parcurge = head
        //while parcurge has a next element
        //parcurge becomes parcurge.next
        //parcurge.next = node

        if (head == null){
            head = node;
            return;
        }

        Node parcurge = head;
        while (parcurge.getNextElement() != null){
            parcurge = parcurge.getNextElement();
        }

        parcurge.setNextElement(node); /*LEGATURA: cea mai importanta chestie din LL*/
    }

    //Display all elements of the list separated by space
    String print(){
        return " ";
    }
}
