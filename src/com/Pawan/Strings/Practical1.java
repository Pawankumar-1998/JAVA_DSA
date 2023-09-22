package com.Pawan.Strings;

public class Practical1 {
    public static void main(String[] args) {

        long timeCount = System.currentTimeMillis();
        StringBuffer sbu = new StringBuffer("pawan");
//        for (int i = 0; i < 100000; i++) {
//                sbu.append("kumar");
//        }

        int index = sbu.indexOf("a");
        System.out.println(index);
        System.out.println(sbu.replace(0,3,"kum"));

        System.out.println("time take by string buffer is " +  (System.currentTimeMillis() - timeCount) + "ms");

        timeCount = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder("Pawan");
        for (int i = 0; i <100000 ; i++) {
            sb.append("kumar");
        }
        System.out.println("time take by string builder  is " +  (System.currentTimeMillis() - timeCount) + "ms");

    }
}
