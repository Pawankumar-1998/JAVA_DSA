package com.Pawan.Methods.Assignment;

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check weather its prime or not ");
        int num = sc.nextInt();
        System.out.println(prime(num));
    }

    static boolean prime(int num){
        if (num<=1){
            return false;
        }
        int c = 2;
        while (c*c<=num){
            if (num%c==0){
                return false;
            }
            c++;
        }
        if (c*c>num){
            return true;
        }
        return false;
    }
}
