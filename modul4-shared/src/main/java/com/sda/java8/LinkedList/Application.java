package com.sda.java8.LinkedList;

public class Application {
    public static void main(String[] args) {
        //simpluLL();
        DoubleLinkedNode myNode = new DoubleLinkedNode(200);
        DoubleLinkedNode myNode2 = new DoubleLinkedNode(500);
        DoubleLinkedNode myNode3 = new DoubleLinkedNode(700);
        DoubleLinkedNode myNode4 = new DoubleLinkedNode(900);

        DoubleLinkedList myDoubleLL = new DoubleLinkedList();
        myDoubleLL.add(myNode);
        myDoubleLL.add(myNode2);
        myDoubleLL.add(myNode3);
        myDoubleLL.add(myNode4);
    }

    private static void simpluLL() {
        Node myNode = new Node(20);
        Node myNode2 = new Node(40);
        Node myNode3 = new Node(50);
        Node myNode4 = new Node(70);

        LinkedList myLL = new LinkedList();
        myLL.add(myNode);
        myLL.add(myNode2);
        myLL.add(myNode3);
        myLL.add(myNode4);

        System.out.println(myLL.print());
        myLL.remove(40);
        System.out.println(myLL.print());
    }
}
