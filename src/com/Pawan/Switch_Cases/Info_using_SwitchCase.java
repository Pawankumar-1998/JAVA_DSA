package com.Pawan.Switch_Cases;

import java.util.Scanner;

public class Info_using_SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pin code");
        int num = sc.nextInt();
        switch (num){
            case 765001 ->{
                System.out.println("Welcome to  rayagada");
                System.out.println("Search among hotels , theartes");
                String resource = sc.next();
                switch (resource){
                    case "hotels" ->{
                        System.out.println("Hotel vamsi krishna");
                        System.out.println("Hotel sai international");
                        System.out.println("Swagat hotel");
                        System.out.println("govind sweets");
                    }
                    case "theaters" ->{
                        System.out.println("pvr cinemas (uma shankar)");
                        System.out.println("Ashoka talkies");
                        System.out.println("Uday plaza");
                        System.out.println("Mukta theares");
                        System.out.println("Rama talkies");
                    }
                    default -> System.out.println("Please enter a valid input");
                }
            }
            case 764001 ->{
                System.out.println("Welcome to jeypore ");
                System.out.println("Search among hotels , theartes");
                String resource = sc.next();
                switch (resource){
                    case "hotels" ->{
                        System.out.println("Hotel Princess");
                        System.out.println("Krishna Tara Comforts");
                        System.out.println("Raj Residency");
                        System.out.println("Desia Eco Tourism Camp");
                    }
                    case "theaters" ->{
                        System.out.println("Ciniplex");
                        System.out.println("Sr lova cinema");
                    }
                    default -> System.out.println("Invalid input");
                }
            }
            default -> System.out.println("Please enter a valid pincode");
        }
    }
}
