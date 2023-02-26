package com.Pawan.Assignments;

public class High_altitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(Altitude(gain));
    }
    static int Altitude(int[] arr){
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum = arr[i] + sum;
            if (sum>max){
                max = sum;
            }
        }
        return max;
    }
}
