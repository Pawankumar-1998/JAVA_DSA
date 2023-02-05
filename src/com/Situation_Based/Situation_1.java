package com.Situation_Based;

import java.util.Scanner;
import java.lang.String;

public class ExpireItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        perishable item
        String[] perishableItem = new String[5];
        int[] expiryPerishable = new int[5];

//        non - Perishable item
        String[] nonPerishableItem = new String[5];
        int[] expiryNonPerishable = new int[5];

        int n = perishableItem.length;
//        inserting elements in the perishable array
        for (int i = 0; i < n ; i++) {
            System.out.println("Enter the name of perishable item no " + (i+1));
            perishableItem[i] = sc.next();
            System.out.println("Enter the expiry date (in days) of " + perishableItem[i]);
            expiryPerishable[i] = sc.nextInt();
        }
        System.out.println("Perishable item sorted successfully as per expiry dates");
        bubbleSort(expiryPerishable,perishableItem);
        for (int i = 0; i < n ; i++) {
            System.out.println("item to be sold at " + (i+1) + " is " + perishableItem[i] + " As it expires in -> " + expiryPerishable[i] + " Days");
        }

//        inserting elements in the non - Perishable items
        System.out.println();
        for (int i = 0; i < n ; i++) {
            System.out.println("Enter the name of non - perishable  item no " + (i+1));
            nonPerishableItem[i] = sc.next();
            System.out.println(" Enter the expiry date ( in Days) of " + nonPerishableItem[i]);
            expiryNonPerishable[i] = sc.nextInt();
        }
        System.out.println("Non perishable item sorted successfully as per the expiry dates");
        bubbleSort(expiryNonPerishable,nonPerishableItem);
        for (int i = 0; i <n ; i++) {
            System.out.println("Item to be placed at slot " + (i+1) + " is " + nonPerishableItem[i] + " : Expires in -> " + expiryNonPerishable[i] + " Days ");
        }


    }

    static void bubbleSort(int[] expiry , String[] item){
        int n = expiry.length;
        for(int i=0 ; i<n ; i++){
            for (int j=1; j<n-i; j++) {
                if (expiry[j]<expiry[j-1]){
                    int temp = expiry[j];
                    expiry[j] = expiry[j-1];
                    expiry[j-1] = temp;

                    String tempItem = item[j];
                    item[j] = item[j-1];
                    item[j-1] = tempItem;

                }
            }
        }
    }
}
