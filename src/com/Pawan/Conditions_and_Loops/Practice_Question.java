package com.Pawan.Conditions_and_Loops;

public class Practice_Question {
    public static void main(String[] args) {
//      Q.1  find the maximum number between three numbers
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        int max = a;
//        if (b>max){
//            max=b;
//        }
//        if (c>max){
//            max=c;
//        }
//
//        System.out.println("The largest number of the entered number is  " + max);

//        Another Way to print Greater number using math function

        int max = Math.max(78, Math.max(89, 45));
        System.out.println(max);
    }
}
