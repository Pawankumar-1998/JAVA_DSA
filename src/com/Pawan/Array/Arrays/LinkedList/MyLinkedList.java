package com.Pawan.Array.Arrays.LinkedList;

import java.util.LinkedList;
public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("pawan");
        list.add("dinesh");
        list.add("suman");
        System.out.println(list);
        list.remove("suman");
        System.out.println(list);
        list.add("Rahul");
        list.add("Manas");
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

    }
}
