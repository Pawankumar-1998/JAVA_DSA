package com.Pawan.Searching.BinarySearch.Assignment;

public class Guess_Number {
    public static void main(String[] args) {
//        int[] arr = new int[1000];
        int pick = 50; // this is pick number of computer
        int guess = 78; // this guess number is by us

        System.out.println(guessTheNum(guess,pick));

    }

    static int guessTheNum(int guess , int pick){
        int start = 0;
        int end = guess;
        while (start<=end){
            int mid = start + (end - start ) /2;
//            if the below condition is true then answer in found
            if (guess(mid,pick)==0){
                return mid;
            } else if (guess(mid,pick)==-1) {
                end = mid - 1;
//         if the below condition is true that means the answer element is more than our current number
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int guess(int guess , int pick){
//        if the computer picked number and our guess number are same it returns 0
        if (pick == guess){
            return 0;
//        if the computer picked number is less than our guess number it will return -1
        } else if (pick<guess){
            return -1;
//        if the computer picked number is greater than our guess number it will return 1
        } else {
            return 1;
        }
    }


}
