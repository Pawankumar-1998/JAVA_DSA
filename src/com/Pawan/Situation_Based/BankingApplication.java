package com.Pawan.Situation_Based;

import java.util.Scanner;

public class BankingApplication {

    private static final double minumum_Charges = 100.0;

    private static boolean isValidPassword(String password) {
        if (password.length() < 6 || password.length() > 12) {
            return false;
        }
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if ("$#@".indexOf(c) != -1) {
                hasSpecialChar = true;
            } else {
                return false;
            }
        }
        return hasLowerCase && hasUpperCase && hasDigit && hasSpecialChar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = "pawan";
        String password = "Pawan@1998";
        double balance = 10000.0;
        System.out.println("Enter your username:");
        String inputUsername = scanner.nextLine();
        System.out.println("Enter your password:");
        String inputPassword = scanner.nextLine();

        if (username.equals(inputUsername) && password.equals(inputPassword) && isValidPassword(password)) {
            // login successful
            System.out.println("Login successful.");
        } else {
            System.out.println("Invalid username or password. Please try again.");
            return;
        }

        System.out.println("Your current balance is Rs " + balance);
        System.out.println("Enter the amount you want to withdraw:");
        double amount = scanner.nextDouble();
        double totalAmount = amount + minumum_Charges;
        if (totalAmount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }
        balance -= totalAmount;
        System.out.println("Transaction successful.");
        System.out.println("Your new balance is Rs " + balance);
    }
}
