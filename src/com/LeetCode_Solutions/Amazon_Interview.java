package com.LeetCode_Solutions;

public class Amazon_Interview {
    public static void main(String[] args) {
//        here we are going to find the element in the infinite array
        int[] arr = { 12 , 25 , 47 , 89 , 91 , 121 , 141 , 150 , 162 , 178 , 192 , 201 , 231 , 254};
        int target = 162;
        System.out.println(ans(arr,162));
    }

    static int ans(int[] arr , int target){
        int start = 0;
        int end = 1;

        while (target>arr[end]){
            int newStart = end + 1;
            int newEnd = end + (end-start+1) * 2;
            start = newStart;
            end = newEnd;
        }
        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr , int target , int start , int end ){
        while(start<=end){
            int mid = start + (end-start)/2;

            if (target>arr[mid]){
                start = mid + 1;
            } else if (target<arr[mid]){
                end = mid -1;
            } else {
                return mid;
            }
        }
        return  -1;
    }
}
