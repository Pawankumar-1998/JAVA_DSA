package com.Pawan.Array.Arrays.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;
public class Main {
    public static void main(String[] args) {
        PriorityQueue<String> list = new PriorityQueue<>();
        list.add("pawan");
        list.add("dinesh");
        list.add("manish");
        list.add("rahul");
        list.add("suman");
        Iterator i = list.iterator();
        while (i.hasNext()){
            System.out.println(i.next()+" ");
        }
    }
}
