package com.Pawan.Starting_With_Java;

import java.util.Scanner;

public class Input_From_User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter a number");
//        float a = sc.nextFloat();
//
//        System.out.println("Enter the second number");
//        float b = sc.nextFloat();
//
//        float c = a + b;
//
//        System.out.println("The sum of the entered number is  " + c);
//        System.out.println(sc.nextLine());


//        int a = 258;
//        byte b = (byte) (a);
//        System.out.println(b);

//        int num = 'A';
//        System.out.println(num);

//        System.out.println(5*6.22568475678f);


//        Type Casting Example
        int a = 45;
        byte b = 5;
        float c = 45.6547f;
        char d = 'b';
        double f = 12.578941;
        short s = 5;

        double result = (a*c) + (b/d) + (f*s);
        System.out.println((a*c) + " " +  (b/d) + " " + (f*s));
        System.out.println(result);

    }
}
