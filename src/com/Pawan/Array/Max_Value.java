package com.Pawan.Array;

public class Max_Value {
    public static void main(String[] args) {
        int[] arr = { 1 , 25 , 45 , 87 , 98 , 74 };
        System.out.println(max(arr));

    }
    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
