package com.Pawan.Conditions_and_Loops;

public class Conditions {
    public static void main(String[] args) {
//        int salary = 25000;
        /*
        if (salary > 10000){
            salary = salary + 1000;
        } else {
            salary = salary + 2000;
        }

        System.out.println(salary);

         */

        int salary1 = 25400;
        if (salary1 > 10000) {
            salary1 = salary1 + 1000;
        } else if (salary1 > 15000) {
            salary1 = salary1 + 2000;
        } else {
            salary1 = 5000;
        }

        System.out.println(salary1);

    }
}
