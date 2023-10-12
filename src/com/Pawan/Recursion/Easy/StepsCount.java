package com.Pawan.Recursion.Easy;

public class StepsCount {
    public static void main(String[] args) {
        int ans = numberOfSteps(14);
        System.out.println("number of steps to get zero are : " + ans);
    }
    static int numberOfSteps(int n){
        if (n==0){
            return 0;
        }
        int count = 0;
        count = count + 1;

        if (n%2==0){
            return count + numberOfSteps(n/2);
        }

        return count + numberOfSteps(n-1);
    }
}
