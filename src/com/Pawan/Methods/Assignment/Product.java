package com.Pawan.Methods.Assignment;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number to see there product");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("The product of the entered number is " +product(num1,num2));

    }
    static int product(int a , int b){
        return a*b;
    }
}
