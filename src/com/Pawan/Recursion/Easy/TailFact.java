package com.Pawan.Recursion.Easy;

public class TailFact {
    public static void main(String[] args) {
        System.out.println(f(5,1));
    }
    static int f(int n , int ansStorage){
        if (n==1){
            return ansStorage;
        }
        /**
         * this below line always create a new stack which may cause stack overflow
         *
         * Time complexity = o(n)
         */

        return f(n-1,n * ansStorage);
    }
}
