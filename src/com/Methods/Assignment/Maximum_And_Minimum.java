package com.Methods.Assignment;

import java.util.Scanner;

public class Maximum_And_Minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number to see the maximum and minimum amongs them");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println("the maximum number entered  is " + maximum(num1,num2,num3));
        System.out.println("the minimum number entered is " + minimum(num1,num2,num3));
    }

    static int maximum(int a , int b , int c){
        if (a>b && a>c){
            return a;
        } else if (b>a && b > c){
            return b;
        } else {
            return c;
        }
    }

    static int minimum(int a , int b , int c){
        if (a<b && a<c){
            return a;
        } else if (b<a && b<c){
            return b;
        } else {
            return c;
        }
    }
}
