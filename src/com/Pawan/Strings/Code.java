package com.Pawan.Strings;

public class Code {
    public static void main(String[] args) {
        /*
        String name = "Pawan Kumar";
        System.out.println(name);
        String a = "pawan";
        System.out.println(a);
        here we are not changing the object here we are creating a new object
        a = "kumar";
        System.out.println(a);
         */ // ------------> Example code of immutability of string
        String a = "pawan";
        String b = "pawan";
        System.out.println(a==b); // this is true because it is pointing to the same object and it is in the pool

        String name1 = new String("pawan");
        String name2 = new String("pawan");
        System.out.println(name1==name2); // this is false because reference variable are pointing to the different object as the new keyword is used
        System.out.println(name1.equals(name2)); // this is true because it compares the value no the object
        System.out.println(name1.charAt(2));


    }
}
