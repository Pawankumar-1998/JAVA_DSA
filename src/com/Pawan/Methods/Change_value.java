package com.Pawan.Methods;

import java.util.Arrays;

public class Change_value {
    public static void main(String[] args) {
        int[] arr = { 12 , 4 , 5 , 7};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] nums){
        nums[0] = 56;
    }
}
