package com.Pawan.Methods;

import java.util.Scanner;

public class Parameters {
    public static void main(String[] args) {
//        int ans = sum(5,7);
//        System.out.println("The addition of the entered number is " + ans);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        String personalised = greeting(name);
        System.out.println(personalised);
    }
//    passing a string from taking input from user

    static String greeting(String name){
        String message = "Hello " + name + " happy to have you";
        return message;
    }
//    here we are passing parameters
    static int sum(int a , int b){
        int sum = a + b;
        return sum;
    }
}
