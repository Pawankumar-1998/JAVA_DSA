package com.Pawan.Methods;

import java.util.Scanner;

public class Prime_Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to see its a prime or not");
        int num = sc.nextInt();
       boolean ans = prime(num);
        System.out.println(ans);
    }

    static boolean prime(int n){
        if (n<=1){
            return false;
        }

        int c = 2;
        while (c*c<=n){
            if (n%c==0){
                return false;
            }
            c++;
        }
        if (c*c>n){
            return true;
        }
        return false;
    }


}
