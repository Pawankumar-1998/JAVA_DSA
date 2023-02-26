package com.Pawan.Searching.BinarySearch;

public class Order_Agnostic {
    public static void main(String[] args) {
        int[] arr = { 54 , 49 , 35 , 32 , 24 , 19 , 14 , 8 , 5};
        int target = 19;
        System.out.println(orderAgnostic(arr,target));
    }




    static int orderAgnostic(int[] arr , int target){
        int start =0;
        int end = arr.length-1;

        boolean ascending;
        if (arr[start]<arr[end]){
            ascending = true;
        } else {
            ascending = false;
        }

        while (start<=end){
            int mid = start + (end-start)/2;
            if (target==arr[mid]){
                return mid;
            }

            if (ascending){
                System.out.println("Your array is in ascending order ");
                if (target<arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                System.out.println("Your array is in descending order");
                if (target<arr[mid]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
