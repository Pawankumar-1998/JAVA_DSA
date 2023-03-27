package com.Pawan.Array.Arrays.Arraylist;
import java.util.List;
import java.util.Arrays;
import java.util.Iterator;

public class Second {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("pawan","dinesh","rahul");
//        using for loop
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

//        using for each loop
        for(String str : list){
            System.out.println(str);
        }

//        using iterator
        Iterator i = list.iterator();
        if (i.hasNext()){
            String names = (String) i.next();
            System.out.println(names);
        }

//        using lamba expresions
        list.stream().forEach(names-> System.out.println(names));

        //      without stream
        list.forEach((names)-> System.out.println(names));
    }



}
