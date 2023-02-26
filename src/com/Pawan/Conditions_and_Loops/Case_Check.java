package com.Pawan.Conditions_and_Loops;

import java.util.Scanner;

public class Case_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        char ch = sc.next().trim().charAt(0);
//        System.out.println(ch);
//        String word = "hello";
//        System.out.println(word.charAt(2));
//        System.out.println(sc.next().trim().charAt(0));

//        Program to check upper case or lower case
        char ch = sc.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lower case ");
        } else {
            System.out.println("Upper case ");
        }
    }
}
