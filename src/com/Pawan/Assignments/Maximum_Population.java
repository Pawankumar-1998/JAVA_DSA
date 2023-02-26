package com.Pawan.Assignments;

public class Maximum_Population {
    public static void main(String[] args) {
        int[][] logs = {
                {1993,1999},
                {2000,2010}
        };
        System.out.println(population(logs));
    }

    static int population(int[][] logs){
        int maxYear = 1950;
        int maxValue = 0;
        int[] arr = new int[100];
        for (int i = 0; i < logs.length ; i++) {
            for (int j = logs[i][0]; j <logs[i][1] ; j++) {
                arr[j-1950]++;
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>maxValue){
                maxValue = arr[i];
                maxYear = i + 1950;
            }
        }
        return  maxYear;
    }
}
