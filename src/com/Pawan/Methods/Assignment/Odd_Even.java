package com.Pawan.Methods.Assignment;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to see its orr or even ");
        int num = sc.nextInt();
        odd_even(num);
    }

    static void odd_even(int num){
        if (num%2 == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
