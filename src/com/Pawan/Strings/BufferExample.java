package com.Pawan.Strings;

public class BufferExample {
    public static void main(String[] args) {
        /*
//        StringBuffer s = new StringBuffer("Pawan");
//        s.append("Kumar");
//        s.insert(1,"kumar");
//        s.replace(1,3,"Kumar");
//        s.delete(1,3);
//        s.reverse();
//        System.out.println(s);

         */

        StringBuffer s = new StringBuffer();
        System.out.println(s.capacity());
        s.append("pawan");
        System.out.println(s.capacity());
        s.append("Kumar is my full name ");
        System.out.println(s.capacity());
        s.ensureCapacity(20);
        System.out.println(s.capacity());
        s.ensureCapacity(50);
        System.out.println(s.capacity());

        StringBuffer str = new StringBuffer(20);
        System.out.println(str.capacity());


    }
}
