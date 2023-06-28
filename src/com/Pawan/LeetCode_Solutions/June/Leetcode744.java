package com.Pawan.LeetCode_Solutions.June;

public class Leetcode744 {
    public static void main(String[] args) {
        /*
        Input: letters = ["c","f","j"], target = "a"
        Output: "c"
        Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
         */

        char[] letters = {'x','x','y','y'};
        char target = 'z';
        System.out.println(nextGreaterChar(letters,target));
    }
    static char nextGreaterChar(char[] arr , char target){
            int n = arr.length;
            int start = 0;
            int end = n-1;

            while (start<=end){
                int mid = start + (end - start)/2;
                if (arr[mid]==target){
                    return arr[mid+1];
                } else if (arr[mid]<target) {
                    start = mid + 1;
                } else {
                    end = mid-1;
                }
            }
            return start < n ? arr[start] : arr[0];
    }
}
