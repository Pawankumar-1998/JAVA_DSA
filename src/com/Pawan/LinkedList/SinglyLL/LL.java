package com.Pawan.LinkedList.SinglyLL;

public class LL {
    private Node head;
    private Node tail;
    private int sizeOfLL;

    public LL(){
        this.sizeOfLL = 0;
    }
    //    function for inserting the node at the first
    public void insertAtFirst(int value){
//        create a node first
        Node node = new Node(value);
        node.addressOfNextNode = head;
        head = node;

        if(tail==null){
//            this is the first element
            tail = head;
        }
        sizeOfLL += 1;
    }

//    function for inserting the node at the middle
    public void insertAtPosition(int position , int value){
//         if the head is the first node
        if(head==null){
            insertAtFirst(value);
            return;
        }
        if(position<sizeOfLL){
            int tempCount = 1;
            Node temp = head;
            while (tempCount<position-1){
                temp = temp.addressOfNextNode;
                tempCount++;
            }
//        at this point temp will be pointing to the position
            Node node = new Node(value);
            node.addressOfNextNode = temp.addressOfNextNode;
            temp.addressOfNextNode = node;
        } else {
            System.out.println("Invalid position entered");
        }


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

//    this function is used for adding the element at the last
    public void insertAtLast(int value){
//        if the tail is null we need to add a element at the first
        if (tail==null){
            insertAtFirst(value);
        }else{
            Node node = new Node(value);
            tail.addressOfNextNode = node;
            tail = node;
            sizeOfLL += sizeOfLL;
        }

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
