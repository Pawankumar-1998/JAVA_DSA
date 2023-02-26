package com.Pawan.Array;



public class Max_In_Range {
    public static void main(String[] args) {

        int[] arr = { 1 , 5 , 4 , 8 , 7 , 9};
        int ans = range(arr,2,5);
        System.out.println(ans);

    }
    static int range(int[] arr , int start , int end){
        int max = arr[start];
        for (int i = start; i <=end ; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
