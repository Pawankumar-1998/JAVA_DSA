package com.Searching.BinarySearch;

public class Floor_Number {
    public static void main(String[] args) {
        int[] arr = { 2 , 5 , 7 , 12 , 14 , 25 , 27 , 32};
        int target = 15;
        System.out.println(floorOfNumber(arr,target));
    }
    static int floorOfNumber(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;

        while (start<=end){
            int mid = start + (end-start) / 2;
            if (arr[mid]==target){
                return arr[mid];
            } else if (target>arr[mid]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[end];
    }
}
