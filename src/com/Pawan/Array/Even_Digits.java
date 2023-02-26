package com.Pawan.Array;

public class Even_Digits {
    public static void main(String[] args) {
        int[] nums = { 12,345,2,6,7896};
        System.out.println(even(nums));
    }


    static int even(int[] nums){
        int result = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (check(nums[i])){
                result++;
            }
        }
        return result;
    }

    static boolean check(int num){
        int ans = numOfDigtis(num);
        if (ans%2==0){
            return true;
        }
        return false;
    }

    static int numOfDigtis(int num){
        int count = 0;
        while (num>0){
            count ++;
            num = num/10;
        }
        return count;
    }
}
