package com.Pawan.LinkedList.SinglyLL;

public class LL {
    private Node head;
    private Node tail;
    private int sizeOfLL;

    public LL(){
        this.sizeOfLL = 0;
    }
    //    function for inserting the node
    public void insertAtFirst(int value){
//        create a node first
        Node node = new Node(value);
        node.addressOfNextNode = head;
        head = node;

        if(tail==head){
//            this is the first element
            tail = head;
        }
        sizeOfLL += 1;
    }

//    this function is used for printing the elements
    public void printLL(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value + "-->");
            temp = temp.addressOfNextNode;
        }
        System.out.println("END");
    }

    //    structure of the node
    private class Node{
        private int value;
        private Node addressOfNextNode;

        public Node(int value){
            this.value = value;
        }

        public Node(int value , Node addressOfNextNode){
            this.value = value;
            this.addressOfNextNode = addressOfNextNode;
        }
}
}
