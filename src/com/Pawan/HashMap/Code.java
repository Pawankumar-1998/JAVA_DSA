package com.Pawan.HashMap;
import java.util.HashMap;
import java.util.Map;

public class Code {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer,String>();

        map.put(1,"pawan");
        map.put(2,"suman");
        map.put(3,"pranjal");
        map.put(1,"kumar");

        System.out.println("Iterating the loops ");

        for (Map.Entry detail : map.entrySet()){
            System.out.println(detail.getKey() + " " + detail.getValue());
        }
    }

}

