package com.Pawan.Recursion;

public class Febonnaci {
    public static void main(String[] args) {
//        using the recursion

        int ans=febonacci(50);
        System.out.println("the febonacci number of the entered number is :" + ans);


    }
    static int febonacci(int n){
        if(n==0){
            return 0;
        } else if(n==1){
            return 1;
        }else {
            return febonacci(n-2) + febonacci(n-1);
        }
    }
}
