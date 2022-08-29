package com.Linear_Search;

public class Even_digits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896,89};
        System.out.println(EvenDigit(nums));
    }

    static int EvenDigit(int[] nums){
        int count = 0;
        for (int element : nums){
            if (even(element)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int nums){
        int numberOfDigits = countOfNumber(nums);
        /*
         if (numberOfDigits%2==0){
            return true;
        }
         */
        return numberOfDigits % 2 == 0;
    }

    static int countOfNumber(int num){
        int count = 0;
        while (num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}
