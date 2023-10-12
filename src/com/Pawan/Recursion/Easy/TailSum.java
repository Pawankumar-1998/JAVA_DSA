package com.Pawan.Recursion.Easy;

public class TailSum {
    public static void main(String[] args) {
        System.out.println(f(5,0));
    }
    static int f(int n , int ansContainer){
        if (n==0){
            return ansContainer;
        }

        /**
         * this below line will not create a new stack as it uses the current stack
         * with updated parameters and the local variables
         *
         * Time complexity = o(1) because use the same stack
         */

        return f(n-1,n+ansContainer);
    }
}
