package com.sda.java8.LinkedList;

public class Application {
    public static void main(String[] args){
        Node myNode = new Node(20);
        Node myNode2 = new Node(40);
        Node myNode3 = new Node(50);

        LinkedList myLL = new LinkedList();
        myLL.add(myNode);
        myLL.add(myNode2);
        myLL.add(myNode3);
    }
}
