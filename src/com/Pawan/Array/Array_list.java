package com.Pawan.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(564);
        list.add(54);
        list.add(571);
        list.add(569);
        list.add(501);
        list.add(128);
        list.add(19);
        list.add(14);
        list.add(1);
        list.add(247);
        list.add(21);
        list.add(58);
        list.add(61);
        list.add(78);
        list.add(60);
        list.add(0,56);

        System.out.println(list.contains(21)); // it returns true if the value is present in the list
//        for (int i = 0; i <10 ; i++) {
//            System.out.println(list.get(i));
//        }
        System.out.println(list);
        list.set(0,99);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }
}
