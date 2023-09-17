package com.Pawan.Recursion;

public class BinarySearch {
    public static void main(String[] args) {
                int[] arr = {4,8,9,11};
        System.out.println(bs(arr,11,0,arr.length-1));
    }
    static int bs(int[] arr , int target , int start , int end ){
        while (start<=end){
            int mid = start + (end-start) / 2;
            if (arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                return bs(arr,target,mid+1,end);
            } else {
                return bs(arr,target,start,mid-1);
            }
        }
        return -1;
    }
}
