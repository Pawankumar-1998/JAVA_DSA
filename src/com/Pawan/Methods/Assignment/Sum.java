package com.Pawan.Methods.Assignment;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number ");
        int num2 = sc.nextInt();
        System.out.println("The sum of the entered number is " + sum(num1,num2));
    }

    static int sum(int a , int b){
        return a+b;
    }
}
