package com.Pawan.Recursion.Easy;

public class TailRev {
    public static void main(String[] args) {

        System.out.println(f(1824,0));
    } 
    static int f(int n , int ansStorage){
        if (n==0){
            return ansStorage;
        }


        return f(n/10 , ansStorage * 10 + (n%10));
    }
}
