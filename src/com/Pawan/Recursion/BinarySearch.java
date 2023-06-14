package com.Pawan.Recursion;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {1,2,3,6,7,88,99};
        int target = 56;

        System.out.println(bS(arr,target,0,arr.length-1));
    }

    static int bS(int[] arr , int target , int s , int e){

//        base condition
        if (s>e){
            return -1;
        }

//        body of the recursion
        int m = s + (e - s) / 2;
        if (arr[m] == target){
            return  m;
        }

        if (target>arr[m]){
            return bS(arr,target,m+1,e);
        }

        return bS(arr,target,s,m-1);
    }
}
