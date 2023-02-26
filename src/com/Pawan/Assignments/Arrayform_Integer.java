package com.Pawan.Assignments;

import java.util.ArrayList;
import java.util.Collections;

public class Arrayform_Integer {
    public static void main(String[] args) {
        int[] nums = {1,2,0,0};
        int k = 34;
//        addToArrayForm(nums,k);

        System.out.println(addToArrayForm(nums,k));

    }

    static ArrayList<Integer> addToArrayForm(int[] num , int k){
        int n = num.length;
        int i = num.length - 1;

        ArrayList<Integer> sol = new ArrayList<>();
        while (i>=0||k>0){
            if (i>=0){
                sol.add((num[i]+k)%10);
                k = (num[i]+k)/10;
            } else {
                 sol.add(k%10);
                 k = k / 10;
            }
            i--;
        }
        Collections.reverse(sol);
        return sol;
    }
}
