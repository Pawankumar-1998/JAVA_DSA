package com.Pawan.Array;

import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        System.out.println(list.size());
        list.add("pawan");
        list.add("dinesh");
        list.add(1,"suman");
        System.out.println(list.get(2));
        System.out.println(list.size());
        list.set(2,"takiri babu");
        System.out.println(list.get(2));
        System.out.println(list.isEmpty());
        boolean naam = list.contains("Pawan");
        System.out.println(naam);
        list.remove(1);
        System.out.println(list.size());
//        list.removeAll(list);
//        System.out.println(list.size());
        System.out.println(list.indexOf("takiri babu"));

    }
}
