package com.Pawan.Situation_Based;

import java.util.Scanner;

public class Situation_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product name to order");
        String product = sc.nextLine();
        switch (product){
            case "chocolate" :
                System.out.println("Welcome to " + product + " inventory");
            {
                int minUnits = 25;
                int maxUnits = 100;
                int currentQuantity = 0;
                System.out.println("How many " + product + " are to be supplied to vendor ");
                int placeOrder = sc.nextInt();
                int remainingItem = maxUnits - placeOrder;
                if ( remainingItem >  minUnits){
                    currentQuantity = maxUnits - placeOrder;
                    System.out.println(" Order supplied successfully");
                    System.out.println("Current stock left in the inventory is " + currentQuantity);
                } else {
                    System.out.println("Order cannot be placed Limit Exceeded");
                }
            }
            break;

            case "ice cream":
                System.out.println("Welcome to " + product + " inventory");
            {
                int minUnits = 100;
                int maxUnits = 300;
                int currentQuantity = 0;
                System.out.println("How many " + product + " are to be supplied to vendor ");
                int placeOrder = sc.nextInt();
                int remainingItem = maxUnits - placeOrder;
                if ( remainingItem >  minUnits){
                    currentQuantity = maxUnits - placeOrder;
                    System.out.println(" Order supplied successfully");
                    System.out.println("Current stock left in the inventory is " + currentQuantity);
                } else {
                    System.out.println("Order cannot be placed Limit Exceeded");
                }
            }
                break;
            case "oil packet":
                System.out.println("Welcome to " + product + " inventory");
            {
                int minUnits = 150;
                int maxUnits = 700;
                int currentQuantity = 0;
                System.out.println("How many " + product + " are to be supplied to vendor ");
                int placeOrder = sc.nextInt();
                int remainingItem = maxUnits - placeOrder;
                if ( remainingItem >  minUnits){
                    currentQuantity = maxUnits - placeOrder;
                    System.out.println(" Order supplied successfully");
                    System.out.println("Current stock left in the inventory is " + currentQuantity);
                } else {
                    System.out.println("Order cannot be placed Limit Exceeded");
                }
            }
                break;

            case "soap":
                System.out.println("Welcome to " + product + " inventory");
            {
                int minUnits = 50;
                int maxUnits = 200;
                int currentQuantity = 0;
                System.out.println("How many " + product + " are to be supplied to vendor ");
                int placeOrder = sc.nextInt();
                int remainingItem = maxUnits - placeOrder;
                if ( remainingItem >  minUnits){
                    currentQuantity = maxUnits - placeOrder;
                    System.out.println(" Order supplied successfully");
                    System.out.println("Current stock left in the inventory is " + currentQuantity);
                } else {
                    System.out.println("Order cannot be placed Limit Exceeded");
                }
            }
                break;
            case "chips":
                System.out.println("Welcome to " + product + " inventory");
            {
                int minUnits = 300;
                int maxUnits = 1000;
                int currentQuantity = 0;
                System.out.println("How many " + product + " are to be supplied to vendor ");
                int placeOrder = sc.nextInt();
                int remainingItem = maxUnits - placeOrder;
                if ( remainingItem >  minUnits){
                    currentQuantity = maxUnits - placeOrder;
                    System.out.println(" Order supplied successfully");
                    System.out.println("Current stock left in the inventory is " + currentQuantity);
                } else {
                    System.out.println("Order cannot be placed Limit Exceeded");
                }
            }
                break;
            default:
                System.out.println("invalid item entered");
        }

    }
}
