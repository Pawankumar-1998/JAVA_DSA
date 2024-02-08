package com.Pawan.Situation_Based.Assignment;

//Using Arrays and Bubble sort to solve this problem

import java.util.Scanner;

public class Employees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch , sum = 0 , eSum = 0 , pSum = 0;
//     --------------------------------------------

        System.out.println("Welcome to Tata Groups");
        System.out.println("1. Enter into Marketing Department");
        System.out.println("2. Enter into Sales Department");
        System.out.println("3. Enter into IT Department");
        System.out.println("4. Enter into Customer Service Department");

        System.out.println("Enter your choice ");
        ch = sc.nextInt();
//        -----------------------------------------
        //                  ``` Marketing Dept```
        switch (ch) {
            case 1:
                int[] mEmpSalary = new int[10]; //array of marketing employees
                String[] mEmpNames = new String[10]; // names array
                System.out.println(" Welcome to Marketing Department ");
                for (int i = 0; i < 10; i++) {
                    System.out.println(" Enter the name of the employee ");
                    mEmpNames[i] = sc.next();

                    System.out.println(" Enter the salary of " + mEmpNames[i]);
                    mEmpSalary[i] = sc.nextInt();
                }
                //                Bubble Sort
                bubbleSort(mEmpSalary, mEmpNames);
                System.out.println(" The highest salary is paid to " + mEmpNames[9] + " with salary " + mEmpSalary[9]);
                System.out.println(mEmpNames[9] + " is the manager in marketing department ");
//                for average salary
                for (int i = 0; i < 10 ; i++) {
                    if (i<3){
                        pSum = pSum + mEmpSalary[i];
                    } else if (i<9){
                        eSum = eSum + mEmpSalary[i];
                    } else {
                        sum = sum + mEmpSalary[i];
                    }
                }




                break;
//                  ``` Sales Dept```
            case 2:
                int[] sEmpSalary = new int[10];
                String[] sEmpNames = new String[10];
                System.out.println(" Welcome to Sales Department ");
                for (int i = 0; i < 10; i++) {
                    System.out.println(" Enter the name of the employee ");
                    sEmpNames[i] = sc.next();

                    System.out.println(" Enter the salary of " + sEmpNames[i]);
                    sEmpSalary[i] = sc.nextInt();
                }
                //                Bubble Sort
                bubbleSort(sEmpSalary, sEmpNames);
                System.out.println(" The highest salary is paid to " + sEmpNames[9] + " with salary " + sEmpSalary[9]);
                System.out.println(sEmpNames[9] + " is the manager in sales department ");
                for (int i = 0; i < 10 ; i++) {
                    if (i<3){
                        pSum = pSum + sEmpSalary[i];
                    } else if (i<9){
                        eSum = eSum + sEmpSalary[i];
                    } else {
                        sum = sum + sEmpSalary[i];
                    }
                }

                break;
//                  ``` IT Dept```
            case 3:
                int[] iEmpSalary = new int[10];
                String[] iEmpNames = new String[10];
                System.out.println(" Welcome to Sales Department ");
                for (int i = 0; i < 10; i++) {
                    System.out.println(" Enter the name of the employee ");
                    iEmpNames[i] = sc.next();

                    System.out.println(" Enter the salary of " + iEmpNames[i]);
                    iEmpSalary[i] = sc.nextInt();
                }
                //                Bubble Sort
                bubbleSort(iEmpSalary, iEmpNames);
                System.out.println(" The highest salary is paid to " + iEmpNames[9] + " with salary " + iEmpSalary[9]);
                System.out.println(iEmpNames[9] + " is the manager in IT Department ");
                for (int i = 0; i < 10 ; i++) {
                    if (i<3){
                        pSum = pSum + iEmpSalary[i];
                    } else if (i<9){
                        eSum = eSum + iEmpSalary[i];
                    } else {
                        sum = sum + iEmpSalary[i];
                    }
                }


                break;
            case 4:
                //                  ```Customer Service Dept```
                int[] cEmpSalary = new int[10];
                String[] cEmpNames = new String[10];
                System.out.println(" Welcome to Customer Service Department ");
                for (int i = 0; i < 10; i++) {
                    System.out.println(" Enter the name of the employee ");
                    cEmpNames[i] = sc.next();

                    System.out.println(" Enter the salary of " + cEmpNames[i]);
                    cEmpSalary[i] = sc.nextInt();
                }
                //                Bubble Sort
                bubbleSort(cEmpSalary, cEmpNames);
                System.out.println(" The highest salary is paid to " + cEmpNames[9] + " with salary " + cEmpSalary[9]);
                System.out.println(cEmpNames[9] + " is the manager in Customer Service ");
                for (int i = 0; i < 10 ; i++) {
                    if (i<3){
                        pSum = pSum + cEmpSalary[i];
                    } else if (i<9){
                        eSum = eSum + cEmpSalary[i];
                    } else {
                        sum = sum + cEmpSalary[i];
                    }
                }

                break;

            case 5:
                // for managers average
                 averageSalary(sum);
                 break;
            case 6:
                // for employee average
                averageSalary(eSum);
            default:
                System.out.println("Invalid");
                break;

        }


    }


    static void averageSalary(int sum ){
        int average = sum / 4;
        System.out.println("The average salary is : " + average);
    }
    static void bubbleSort(int[] names , String[] salary){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i - 1; j++) {
                if (names[j] > names[j + 1]) {
//                    sorts according to salary amount
                    int temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
//                    sorts the names with respective to the salary
                    String tempName = salary[j];
                    salary[j] = salary[j + 1];
                    salary[j + 1] = tempName;
                }
            }
        }
    }
}
