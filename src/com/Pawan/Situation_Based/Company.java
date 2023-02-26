package com.Pawan.Situation_Based;

import java.util.Scanner;

/*
Condition :-
There is a company maintaining five different products.
company has a policy to maintain minimum quantity in hand ,
for each product which is also a different value against different product ,
when company is supplying the product to its vendor ensures that quantity in hand is to be maintained ,
at the same time company also ensure the maximum stock in hand for each of the product.
 */

public class Company {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nameOfProduct = new String[5];
        int[] minUnits = new int[5];
        int[] maxUnits = new int[5];
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Enter the name of the product " + (i+1));
            nameOfProduct[i] = sc.next();
            System.out.println("Enter the minimum quantity of " + nameOfProduct[i] + " to be maintained");
             minUnits[i] = sc.nextInt();
            System.out.println("Enter the maximum quantity of " + nameOfProduct[i] + " to be maintained");
            maxUnits[i] = sc.nextInt();
        }
        productSales(nameOfProduct,minUnits,maxUnits);
    }

    static void productSales(String[] name , int[] min , int[] max) {
        Scanner sc = new Scanner(System.in);
        int currentQuantity = 0;
        System.out.println("Enter the item id to place order ");
        int num = sc.nextInt();
        switch (num) {
            case 1 :
                System.out.println("How many " + name[0] + " are to be supplied to vendor ");
//                was having issue of scope
            {
                int placeOrder = sc.nextInt();
                int leftUnits = max[0] - placeOrder;
                if (leftUnits > min[0]) {
                    currentQuantity = max[0] - placeOrder;
                    System.out.println(" Order supplied successfully");
                    System.out.println("Current stock left in the inventory is " + currentQuantity);
                } else {
                    System.out.println("Limit Exceeded");
                }
            }
                break;

            case 2:
                System.out.println("How many " + name[1] + " are to be supplied to vendor ");
            {
                int placeOrder = sc.nextInt();
                int leftUnits = max[1] - placeOrder;
                if (leftUnits > min[1]) {
                    currentQuantity = max[1] - placeOrder;
                    System.out.println(" Order supplied successfully");
                    System.out.println("Current stock left in the inventory is " + currentQuantity);
                } else {
                    System.out.println("Limit Exceeded");
                }
            }
                break;

            case 3:
                System.out.println("How many " + name[2] + " are to be supplied to vendor ");
            {
                int placeOrder = sc.nextInt();
                int leftUnits = max[2] - placeOrder;
                if (leftUnits > min[2]) {
                    currentQuantity = max[2] - placeOrder;
                    System.out.println(" Order supplied successfully");
                    System.out.println("Current stock left in the inventory is " + currentQuantity);
                } else {
                    System.out.println("Sorry ! Limit Exceeded");
                }
            }
                break;

            case 4:
                System.out.println("How many " + name[3] + " are to be supplied to vendor ");
            {
                int placeOrder = sc.nextInt();
                int leftUnits  = max[3] - placeOrder;
                if (leftUnits > min[3]) {
                    currentQuantity = max[3] - placeOrder;
                    System.out.println(" Order supplied successfully");
                    System.out.println("Current stock left in the inventory is " + currentQuantity);
                } else {
                    System.out.println("Sorry ! Limit Exceeded");
                }
            }
                break;

            case 5:
                System.out.println("How many " + name[4] + " are to be supplied to vendor ");
            {
                int placeOrder = sc.nextInt();
                int leftUnits = max[4] - placeOrder;
                if (leftUnits > min[4]) {
                    currentQuantity = max[4] - placeOrder;
                    System.out.println(" Order supplied successfully");
                    System.out.println("Current stock left in the inventory is " + currentQuantity);
                } else {
                    System.out.println("Sorry ! Limit Exceeded");
                }
            }
                break;
            default:
                System.out.println("Wrong item id entered " +
                        "Please check the item id");
        }


        /*
        int currentQuantity = 0;
        System.out.println("How many " + name + " are to be supplied to vendor ");
        int placeOrder = sc.nextInt();
        int remainingItem = max - placeOrder;
        if ( remainingItem >  min){
            currentQuantity = max - placeOrder;
            System.out.println(" Order supplied successfully");
            System.out.println("Current stock left in the inventory is " + currentQuantity);
        } else {
            System.out.println("Limit Exceeded");
        }
    }

         */
    }

}
