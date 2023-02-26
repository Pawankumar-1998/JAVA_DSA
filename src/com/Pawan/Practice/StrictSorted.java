package com.Pawan.Practice;

import java.util.Arrays;

public class StrictSorted {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(Arrays.toString(search(arr,12)));
    }
    static int[] binarySearch(int[][] matrix , int row , int cStart , int cEnd , int target){
        while (cStart<=cEnd) {
            int mid = cStart + (cEnd - cStart ) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            } else if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[] { -1 , -1 };
    }

    static int[] search(int[][] matrix , int target ){
        int row = matrix.length;
        int col = matrix[0].length;

        if (col==0){
            return new int[] { -1 , -1 };
        }
        if (row==1){
            return binarySearch(matrix,0,0,col-1,target);
        }

        int rStart = 0;
        int rEnd = row - 1;
        int cMid = col/2;

        while (rStart<(rEnd-1)){
            int rMid = rStart + (rEnd-rStart)/2;
            if (matrix[rMid][cMid]==target){
                return new int[] { rMid , cMid };
            }
            if (matrix[rMid][cMid]<target){
                rStart = rMid;
            } else {
                rEnd = rMid;
            }
        }
//        after the while loop only two rows will be remaining
        if (target==matrix[rStart][cMid]){
            return new int[] { rStart , cMid};
        }
        if (target == matrix[rStart+1][cMid]){
            return new int[] { rStart+1 , cMid};
        }
        //        search in first half
        if (target<=matrix[rStart][cMid]){
            return binarySearch(matrix,rStart,0,cMid-1,target);
        }
//        search in second half
        if (target>=matrix[rStart][cMid+1]&&target<=matrix[rStart][col-1]){
            return binarySearch(matrix,rStart,cMid+1,col-1,target);
        }
//        search in third half
        if (target<=matrix[rStart+1][cMid]){
            return binarySearch(matrix,rStart+1,0,cMid-1,target);
        }
//        search in fourth half
        else {
            return binarySearch(matrix,rStart,cMid+1,col-1,target);
        }
    }
}
