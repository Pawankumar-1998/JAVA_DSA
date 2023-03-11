package com.Pawan.OOPS.Inhertitance;

public class WrapperClass {
    public static void main(String[] args) {
        int a = 10;
        Integer b = a; //auto-Boxing
        System.out.println(b);

       int c = b;  // un-Boxing
        System.out.println(c);
    }
}
