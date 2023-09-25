package com.Pawan.Recursion.Easy;

public class Print_1_to_5 {
    public static void main(String[] args) {
        f(5);
    }
    static void f(int n){
        if (n==0){
            return;
        }
        f(n-1);
        System.out.println(n);
    }
}
