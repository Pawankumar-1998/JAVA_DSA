package com.Pawan.Strings;

public class BuilderExample {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        s.append("Pawan");
        System.out.println(s.capacity());
        System.out.println(s);
        s.replace(1,3,"Kumar");
        System.out.println(s);
        s.delete(1,3);
        System.out.println(s);
        s.append("Kumar is my full name ");
        System.out.println(s.capacity());
        s.ensureCapacity(50);
        System.out.println(s.capacity());
    }
}
