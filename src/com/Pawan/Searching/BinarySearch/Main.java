package com.Pawan.Searching.BinarySearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 20 , 25 , 29 , 31 , 35 , 38 , 40 , 41 , 45 , 50 , 57 , 58 , 59 };
        System.out.println("Enter the number you want to search");
        int target = sc.nextInt();
        int ans = binarySearch(arr,target);
        if (ans>=0) {
            System.out.println("The number you are looking for is in index no :" + ans);
        } else {
            System.out.println("The is no such number in the array");
        }
    }

      static int binarySearch(int[] array , int target){
        int start = 0;
        int end = array.length - 1;
        while (start<=end){
            int mid = start + (end-start)/2;
//            if target element is the answer here it directly returns the mid
            if (target==array[mid]){
                return mid;
//            if the target element is less than middle than search on left
            } else if (target<array[mid]){
                end = mid - 1;
            }
//            if the target element is greater than the middle then search on right
            else {
                start = mid + 1;
            }
        }
//        if none of them execute return -1;
        return -1;
      }
}
