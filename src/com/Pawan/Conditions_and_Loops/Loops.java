package com.Pawan.Conditions_and_Loops;

public class Loops {
    public static void main(String[] args) {
        /*
        Syntax of the for loop
        for( initialization , condition , increment / decrement )
        {
//        body
         }

         */

//        Q.1 Print 1 to 5
//         Using for loop
//        for(int i=1 ; i<=5 ; i+=2){
//            System.out.println(i);
//        }

//        Q.2 print number for 0 to n . Take Input from the user
//        Scanner sc = new Scanner(System.in);
//        System.out.print("How many numbers you want to display : ");
//        int n = sc.nextInt();
//        for (int i = 0; i <=n ; i++) {
//            System.out.print(i + " ");
//        }

//        Solve Q.1 using while loop
//        Syntax of while loop
        /*
        initialisation  -------> outside the while loop;
        while(condition){
        body
        increment / decrement
        }
         */

//        int num = 1;
//        while (num<=5){
//            System.out.println(num);
//            num++;
//        }

        /*
        Syntax of do while loop
        initialisation
        do {
        body
        increment / decrement
        } while(condition) --------> Here the loop will run once then it will cheak the condition

         */

//      Solving Q.1 using do while loop
        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n != 2);


    }
}
