package com.Pawan.LeetCode_Solutions.Mar;

import java.util.Arrays;

public class Number_977 {
    public static void main(String[] args) {
        /*
        Input: nums = [-4,-1,0,3,10]
        Output: [0,1,9,16,100]
        Explanation: After squaring, the array becomes [16,1,0,9,100].
        After sorting, it becomes [0,1,9,16,100].
         */

        int[] nums = {-4,-1,0,3,10};
//        sortedArrays(nums);
        System.out.println(Arrays.toString(sortedArrays(nums)));
    }
    static int[] sortedArrays(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        for (int i = 0; i <n ; i++) {
            ans[i] = arr[i] * arr[i]; //[0,1,9,16,100]
        }
//        sending into sorting algorithm
        selectionSort(ans);
        return ans;
    }

    static void selectionSort(int[] ans){
        int n = ans.length;
        for (int i = 0; i < n ; i++) {
            for (int j = i+1; j > 0 ; j--) {
                    if (ans[j] < ans[j-1]){
                        int temp = ans[j];
                        ans[j] = ans[j-1];
                        ans[j-1] = temp;
                    } else {
                        break;
                    }
            }
        }

    }


}
