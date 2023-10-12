package com.Pawan.Recursion.Easy;

public class CountZeros {
    public static void main(String[] args) {
//        1040

        int ans = f(1040);
        System.out.println("the number of zeros in the entered number is : " + ans);
    }
    static int f(int n){
        if (n==0){
            return 0;
        }
        int count = 0;
        if (n%10 == 0) count += 1;

        return count + f(n/10);
    }
}
