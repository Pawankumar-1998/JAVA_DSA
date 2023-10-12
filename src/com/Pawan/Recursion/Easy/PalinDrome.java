package com.Pawan.Recursion.Easy;

public class PalinDrome {
    public static void main(String[] args) {
        System.out.println(palindrome(122));
    }
    static boolean palindrome(int n){
        return n == f(n,0);
    }

    static int f(int n , int ansContainer){
        if (n==0){
            return ansContainer;
        }

        return f(n/10 , ansContainer * 10 + (n%10));
    }
}
