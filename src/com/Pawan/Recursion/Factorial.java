package com.Pawan.Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5,1));
    }
    static int factorial(int  n , int remember ){
        if (n==0){
            return remember;
        }

        return factorial(n-1,n * remember);
    }
}
