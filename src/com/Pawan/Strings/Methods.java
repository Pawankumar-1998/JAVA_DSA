package com.Pawan.Strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Pawan Kumar";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println("       pawan      kumar        ".strip());
        System.out.println(Arrays.toString(name.split("a")));
    }
}
