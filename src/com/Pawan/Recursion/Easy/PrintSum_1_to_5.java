package com.Pawan.Recursion.Easy;

public class PrintSum_1_to_5 {
    public static void main(String[] args) {
        System.out.println(f(5));
    }
    static int f(int n){
        if (n==1){
            return 1;
        }

        if (n==0){
            return 0;
        }

        return n + f(n-1);

    }
}
