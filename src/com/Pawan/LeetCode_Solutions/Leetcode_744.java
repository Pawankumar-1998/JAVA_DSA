package com.Pawan.LeetCode_Solutions;

public class Leetcode_744 {
    public static void main(String[] args) {
        char[] arr = { 'x' , 'x' , 'y' , 'y'};
        char target = 'z';
        System.out.println(arr.length);
        System.out.println(nextGreatestLetter(arr,target));
    }

    static char nextGreatestLetter(char[] arr , char target){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if (start==arr.length){
                return arr[0];
            }
            if (target<arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start];
    }
}
