package com.Pawan.Situation_Based;

import java.util.Scanner;

public class UniversitySelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Information related to different collages
        String[] collages = {"lovely professional university", "chandigarh university ", "kalinga institute of science and technology"};
        int[] advantages = {8, 5, 6};
        boolean[] scholarship = {true, false, true};

        // Display information related to different collages
        System.out.println("List of collages:");
        for (int i = 0; i < collages.length; i++) {
            System.out.println((i + 1) + ". " + collages[i]);
            System.out.println("Advantages: " + advantages[i]);
            System.out.println("Scholarship scheme: " + (scholarship[i] ? "Yes" : "No"));
        }

        // Take input from user for selection of university
        System.out.print("Enter the university number: ");
        int universityNumber = scanner.nextInt();

        // Check if selected university has scholarship scheme
        if (scholarship[universityNumber - 1]) {
            System.out.println("Congratulations! The selected university has a scholarship scheme.");
        } else {
            System.out.println("Sorry! The selected university does not have a scholarship scheme.");
        }

        // Check if selected university has more advantages than others
        int maxAdvantages = advantages[0];
        boolean isMaxAdvantages = true;
        for (int i = 1; i < advantages.length; i++) {
            if (advantages[i] > maxAdvantages) {
                maxAdvantages = advantages[i];
                isMaxAdvantages = true;
            } else if (advantages[i] == maxAdvantages) {
                isMaxAdvantages = false;
            }
        }
        if (isMaxAdvantages && advantages[universityNumber - 1] == maxAdvantages) {
            System.out.println("Congratulations! The selected university has the most advantages.");
        } else {
            System.out.println("Sorry! The selected university does not have the most advantages.");
        }
    }
}
