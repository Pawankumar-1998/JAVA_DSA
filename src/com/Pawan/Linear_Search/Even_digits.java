package com.Pawan.Linear_Search;

public class Even_digits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896,89,-47 ,0};
        System.out.println(EvenDigit(nums));
    }
// this  function returns the nuber
    static int EvenDigit(int[] nums){
        int count = 0;
        for (int element : nums){
            if (even(element)){
                count++;
            }
        }
        return count;
    }
// this function returns true if the count of the digit is even
    static boolean even(int nums){
        int numberOfDigits = countOfNumber(nums);
        /*
         if (numberOfDigits%2==0){
            return true;
        }
         */
        return numberOfDigits % 2 == 0;
    }
// this function returns count of the numbers
    static int countOfNumber(int num){
        if (num<0){
            num= num  *-1;
        }
        if (num==0){
            return  1;
        }
        int count = 0;
        while (num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}
