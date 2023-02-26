package com.Pawan.Methods;

import java.util.Scanner;

public class Method_code {
    public static void main(String[] args) {
       int ans = sum2();
        System.out.println(ans);
    }
//    int return type basically returns the value
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();
        int sum = num1 + num2 ;
        return sum;
    }



//    void return type is just used displaying
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();
        int sum = num1 + num2 ;
        System.out.println("The addition of the entered number is : " + sum);
    }
}
