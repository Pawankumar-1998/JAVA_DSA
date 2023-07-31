package com.Pawan.Practice;

import java.util.Arrays;

public class AlgoPractice_B {
    public static void main(String[] args) {
        int[] arr = {  7 , 8 , 11 , 18 , 5 , 10};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        int n = arr.length;
        boolean sorted;
        for(int i=0 ; i<n ; i++){
            sorted=false;
            for(int j=1 ; j<n-i; j++){
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    sorted = true;
                }
            }
            if (sorted==false){
                break;
            }
        }
    }
}
