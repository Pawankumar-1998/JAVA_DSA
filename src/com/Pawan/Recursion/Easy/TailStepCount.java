package com.Pawan.Recursion.Easy;

public class TailStepCount {
    public static void main(String[] args) {

        int ans = f(14,0);
        System.out.println("number of steps to get zero are : " + ans);

    }

    static int f(int n , int stepCount){
        if (n==0){
            return stepCount;
        }

        stepCount +=1;

        if (n%2 == 0){
            return f(n/2,stepCount);
        }

        return f(n-1,stepCount);
    }
}
