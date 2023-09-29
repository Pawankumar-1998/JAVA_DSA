package com.Pawan.Recursion.Arrays;

import java.util.ArrayList;

public class ReturnArrayList {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,9,12};
        ArrayList<Integer> list = new ArrayList<>();
        f(arr,4,0,list);
        System.out.println(list);

    }
    static ArrayList f(int[] arr , int target , int index , ArrayList<Integer> list){
        if (index==arr.length){
            return list;
        }

        if (arr[index] == target){
            list.add(index);
        }

        return f(arr,target,index+1,list);
    }
}
