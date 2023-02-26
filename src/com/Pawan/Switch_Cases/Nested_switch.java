package com.Pawan.Switch_Cases;

import java.util.Scanner;

public class Nested_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pin code ");
        int num = sc.nextInt();
        switch (num) {
            case 765001 -> {
                System.out.println("Welcome to rayagada , enter school or collage to see the best ones ");
                String edu = sc.next();
                switch (edu) {
                    case "school" -> {
                        System.out.println("Deepti convent school ");
                        System.out.println("Sacred heart school");
                        System.out.println("Vignan vidhyalaya");
                    }
                    case "collage" -> {
                        System.out.println("Mits institute of professional studies ");
                        System.out.println("Gandhi institute of science and technology");
                        System.out.println("IACR Engeenering collage ");
                    }
                    default -> System.out.println("Please enter a valid input");
                }
            }
            case 750017 -> {
                System.out.println("Welcome to Bhubaneswar , enter school or collages to see the best ones ");
                String info = sc.next();
                switch (info) {
                    case "school" -> {
                        System.out.println("ODM Public School");
                        System.out.println("Sai International School");
                        System.out.println("DAV Public School");
                    }
                    case "collage" -> {
                        System.out.println("SOA Bhubaneswar, Bhubaneswar");
                        System.out.println("C. V. Raman Global University, Bhubaneswar");
                        System.out.println("OUAT, Bhubaneswar");
                    }
                    default -> System.out.println("Please enter a valid input");
                }
            }
            default -> System.out.println("Please enter a valid pin code");
        }
    }
}
