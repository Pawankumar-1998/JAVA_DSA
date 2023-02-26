package com.Pawan.Methods.Assignment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to see its factorial");
        int num = sc.nextInt();
        int ans = factorial(num);
        System.out.println(ans);

    }
    static int factorial(int num){
        int sum = 1;
         if (num==0 || num == 1){
             return sum;
         }
        for (int i = 2; i <=num ; i++) {
            sum = sum * i;
        }
        return sum;
    }
}
