package com.Pawan.MergeSort;

import java.util.Arrays;

public class MergeSortAnotherWay {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(f(arr)));
    }
    static int[] f(int[] arr){
        if (arr.length==1){
            return arr;
        }

        int mid = arr.length/2;

//        left array
        int[] arrayLeft = f(Arrays.copyOfRange(arr,0,mid));

//        right array
        int[] arrayRight = f(Arrays.copyOfRange(arr,mid,arr.length));


        return merge(arrayLeft,arrayRight);
    }


    static int[] merge(int[] leftArray , int[] rightArray){
        int[] ans = new int[leftArray.length + rightArray.length];

        int i=0;
        int j=0;
        int k=0;

        while (i< leftArray.length && j< rightArray.length){
            if (leftArray[i]<rightArray[j]){
                ans[k] = leftArray[i];
                i++;
            } else {
                ans[k] = rightArray[j];
                j++;
            }
            k++;
        }

//        check for the left array
        while (i<leftArray.length){
            ans[k] = leftArray[i];
            i++;
            k++;
        }

//        check for the right array
        while(j< rightArray.length){
            ans[k] = rightArray[j];
            j++;
            k++;
        }

        return ans;
    }
}
