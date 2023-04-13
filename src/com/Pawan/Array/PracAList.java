package com.Pawan.Array;

import java.util.ArrayList;
import java.util.Iterator;

public class PracAList {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(12);
        list.add(7);
        list.add(6);

        Iterator<Integer> ite = list.iterator();

        while (ite.hasNext()){
            int i = ite.next();
            System.out.println(i);
        }
    }
}
