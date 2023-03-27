package com.Pawan.Array.Arrays.Arraylist;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
public class ListExample {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("pawan");
        ls.add("suman");
        ls.add("Dinesh");
        System.out.println(ls);
        ls.add(null);
        System.out.println(ls);
        System.out.println(ls.get(1));
    }
}
