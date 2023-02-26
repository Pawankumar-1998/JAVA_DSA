package com.Pawan.Methods.Assignment;

import java.util.Scanner;

public class Maximum_And_Minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number to see the maximum and minimum amongs them");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println("The greatest number entered is " + greatest(num1,num2,num3));
        System.out.println("The smallest number entered is " + smallest(num1,num2,num3));
//        System.out.println("the maximum number entered  is " + maximum(num1,num2,num3));
//        System.out.println("the minimum number entered is " + minimum(num1,num2,num3));
    }

//    this method is used for finding the greatest number
    static int greatest(int a , int b ,int c){
        int max = a;
        if (b>max){
            max = b;
        }
        if (c>max){
            max = c;
        }
        return max;
    }

//    this method is used for finding the smallest number
    static int smallest(int a , int b , int c){
        int min = a;
        if (b < min){
            min = b;
        }
        if (c<min){
            min = c;
        }
        return min;
    }

//    this also another way to solve the question
    /*
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

     */
}
