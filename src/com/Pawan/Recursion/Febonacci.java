package com.Pawan.Recursion;

public class Febonacci {
    public static void main(String[] args) {
        System.out.println(f(5));
    }
    static int f(int n){
        if (n==0) return 0;
        if (n==1) return 1;

        return f(n-1) + f(n-2);
    }
}
