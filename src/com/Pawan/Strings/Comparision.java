package com.Pawan.Strings;

public class Comparision {
    public static void main(String[] args) {
        String s = "Pawan";
        System.out.println(s.hashCode());
        s=s+"Kumar";
        System.out.println(s.hashCode());

        System.out.println("Buffers Hascode ");
        StringBuffer str = new StringBuffer("Pawan");
        System.out.println(str.hashCode());
        str.append("Kumar");
        System.out.println(str.hashCode());
    }
}
