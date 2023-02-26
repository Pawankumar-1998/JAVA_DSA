package com.Pawan.LeetCode_Solutions.Feb;

public class Number_744 {
    public static void main(String[] args) {
    char[] letters ={ 'c','f','j'};
    char target = 'c';
        System.out.println(smallestLetter(letters,target));
//        System.out.println(letters.length);

    /*
    Output: "f"
    Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
     */

    }

    static char smallestLetter(char[] letter , char target){
     int n = letter.length;
     int start =0;
     int end = n-1;
     if (target>=letter[n-1] || target<letter[0]){
         return letter[0];
     }
     while (start+1<end){
         int mid = start+(end-start)/2;
         if (letter[mid]<=target){
             start = mid;
         } else {
             end = mid;
         }

     }
     return letter[end];
    }
}
