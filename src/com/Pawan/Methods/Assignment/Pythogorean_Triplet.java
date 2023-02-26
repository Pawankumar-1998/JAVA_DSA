package com.Pawan.Methods.Assignment;

import java.util.Scanner;

public class Pythogorean_Triplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Note : Please enter the greatest number in third number");
        System.out.println("Enter the first number");
        int first = sc.nextInt();
        System.out.println("Enter the second number");
        int second = sc.nextInt();
        System.out.println("Enter the third number");
        int third = sc.nextInt();
        pytho(first,second,third);
    }

    static void pytho(int a , int b , int c){
        int sum1 = (c*c);
        int sum2 = ((a*a) + (b*b));
        if (sum2==sum1){
            System.out.println("its a pythogorean triplet");
        } else {
            System.out.println("its not a pythogorean triplet");
        }
    }
}
