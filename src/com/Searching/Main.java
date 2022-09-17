package com.Searching;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 20 , 25 , 29 , 31 , 35 , 38 , 40 , 41 , 45 , 50 , 57 , 58 , 59 };
        int target = 29;
        System.out.println(binarySearch(arr,target));
    }

      static int binarySearch(int[] array , int target){
        int start = 0;
        int end = array.length - 1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (target==array[mid]){
                return mid;
            } else if (target<array[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
      }
}
