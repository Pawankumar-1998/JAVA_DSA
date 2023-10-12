package com.Pawan.Recursion.Arrays;

public class RotateBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
//        System.out.println("the pivot in the array is in the index " + pivot(arr,0, arr.length-1));
//        System.out.println("the number you are searching for is at the index ");
        System.out.println(f(arr,0,0, arr.length-1));

    }


    static int f(int[] arr , int target , int start , int end){

        if (start>end){
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target){
            return mid;
        }

//        lets assume the left array is sorted

        if (arr[start] <= arr[mid]){
            if (target>=arr[start] && target<=arr[mid]){
                return f(arr,target,start,mid-1);
            } else {
                return f(arr,target,mid+1,end);
            }
        }

//        if the target is in the right sorted array
        if (target>=arr[mid] && target<=arr[end]){
            return f(arr,target,mid+1,end);
        }

        return f(arr,target,start,mid-1);

    }

    /**
     *
     * below line of code is for binary search using the recursion
     */

    static int bs(int[] arr , int target , int start , int end){
        if (start>end){
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target>arr[mid]){
           return bs(arr,target,mid+1,end);
        } else {
            return bs(arr,target,start,mid-1);
        }
    }


    /**
     *
     * the below code is for finding the pivot element using the recursion
     */


    static int pivot(int[] arr,int start , int end){
        if (start>end){
            return -1;
        }

        int mid = start + (end - start)/2;

//        case one to get the pivot
        if (arr[mid]>arr[mid+1]){
            return mid;
        }

//        second case to get the mid
        if (arr[mid]<arr[mid-1]){
            return mid - 1;
        }

//        third case where the mid will be in the left half
            if (arr[mid] >= arr[start]){
                return pivot(arr, mid+1 , end);
            } else {
                return pivot(arr,start,mid-1);
            }
    }
}
