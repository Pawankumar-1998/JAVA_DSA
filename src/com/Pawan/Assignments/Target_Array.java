package com.Pawan.Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class Target_Array {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] ans = target(nums,index);
        System.out.println(Arrays.toString(ans));

    }
    static int[] target(int[] nums , int[] index){
        int n = index.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            list.add(index[i],nums[i]);
            System.out.println(list);
        }
        int[] target = new int[n];
        for (int i = 0; i <n ; i++) {
            target[i]=list.get(i);
        }
        return target;
    }
}
