package com.Pawan.Conditions_and_Loops;

import java.util.Scanner;

public class Assignment_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Basic Questions
//        Q.1 Area of the circle program
        /*
        System.out.println("Press 1 to enter the diameter or Press 2 to enter the radius");
        int num = sc.nextInt();
        float ans = 0;
        if (num==1){
            System.out.println("Enter the diameter");
            float dia = sc.nextFloat();
            ans = 3.14f * dia;
        } else if (num == 2){
            System.out.println("Enter the radius");
            float rad = sc.nextFloat();
            ans = 3.14f * rad * rad ;
        } else {
            System.out.println("Invalid operation");
        }
        System.out.println("The area of the circle is : " + ans);

         */

//        Q.2 Area of the triangle
        /*
        System.out.println("Enter the base of the triangle");
        float base = sc.nextFloat();
        System.out.println("Enter the height of the triangle");
        float height = sc.nextFloat();

        float area = 0.5f * base * height ;
        System.out.println("The area of the triangle is " + area);

         */

//        Q.3 Area of rectangle program
        /*
        System.out.println("Enter the length of the rectangle ");
        float length = sc.nextFloat();
        System.out.println("Enter the breadth of the rectangle ");
        float breadth = sc.nextFloat();
        float area =  length * breadth;
        System.out.println("The area of the rectangle is : " + area);

         */

//        Q.4 Area of triangle using Heron's Formula
        /*
        System.out.print(" Enter the three sides of triangle to find its area ");
        float side1 = sc.nextFloat();
        float side2 = sc.nextFloat();
        float side3 = sc.nextFloat();
        System.out.println();

        float s = 0.5f * ( side1 + side2 + side3); // Here s means the semi perimeter
        double area = Math.sqrt(s *(s-side1) * (s-side2) * (s-side3)); // Math.sqrt is function used to find the square root of number
        System.out.println(s);
        System.out.println("The area of the triangle is : " + area);

         */

//        Q.5 Area of the parellogram
        /*
        System.out.println("Enter the base of the parllelogram ");
        float base = sc.nextFloat();
        System.out.println("Enter the height of the parllelogram ");
        float height = sc.nextFloat();

        float area = base * height;
        System.out.println("The area of parellogram is : " + area);

         */

//        Q.6 Area of rohmbus
            /*
        System.out.println(" Enter the lenght of two diagonals");
        float d1 = sc.nextFloat();
        float d2 = sc.nextFloat();
        System.out.println();

        float area = ( d1 * d2) / 2;
        System.out.println("The Area of the rombus is " + area);

             */
//        Q.7 Area of equileteral triangle is the same as Q.3
//        Q.8 Perimeter of a circle
        /*

        System.out.println("Enter the radius of the circle");
        float radius = sc.nextFloat();
        float perimeter = 2 * 3.14f * radius;
        System.out.println("The perimeter of the circle is " + perimeter);

         */

//        Q.9  Find the perimeter of the triangle
        /*
        System.out.println("Enter the side of the triangle");
        float side = sc.nextFloat();
        float peri = 3 * side ;
        System.out.println("The perimeter of the triangle is " + peri) ;

         */

//        Q.10 , 11 , 12 and 13 are similar so solving it with using of while loop
        /*
        System.out.println(" Press 1 for perimeter of parellelogram" +
                "Press 2 for perimeter of rectangle " +
                "Press 3 for perimeter of square " +
                "Press 4 for perimeter of rohmbus ");
        float area = 0;

        int select = sc.nextInt();
        if (select==1){
            System.out.print("Enter the base and side of the parllelogram");
            float base = sc.nextFloat();
            float side = sc.nextFloat();
            area = 2 * ( base + side );
            System.out.println("The perimeter of the parellogram is : " + area);
        } else if (select == 2){
            System.out.print("Enter the length and breadth of the rectangle");
            float length = sc.nextFloat();
            float breadth = sc.nextFloat();
            area = 2 * (length + breadth);
            System.out.println("The  perimeter of rectangle is : " + area);
        } else if (select==3){
            System.out.print("Enter the side of the square");
            float side = sc.nextFloat();
            area = 4 * side;
            System.out.println("The perimeter of the square is : " + area);
        } else if (select == 4){
            System.out.println("Enter the side of the rhombus");
            float side = sc.nextFloat();
            area = 4 * side;
            System.out.println(" The perimeter of the rhombus is : " + area);
        } else {
            System.out.println("Invalid option selected please select from the given option");
        }

         */

//        Solving Q 14 , 15 , 16 , 17 , 18

        System.out.println(" Press 1 for volume of cone " +
                "press 2 for volume of prism " +
                "press 3 for volume of cylinder " +
                "press 4 for volume of sphere " +
                "press 5 for volume of pyramid " +
                "press 6 for curved surface area of cylinder " +
                "press 7 for total surface area of cube");

        System.out.println(" Enter a number from the above options ");
        int operation = sc.nextInt();
        float volume = 0;

        if (operation == 1) {
            System.out.print("Enter the radius and height of the cone ");
            float radius = sc.nextFloat();
            float height = sc.nextFloat();
            System.out.println();

            volume = (3.14f * radius * radius * height) / 3;
            System.out.println("The Volume of the cone is :" + volume);

        } else if (operation == 2) {
            System.out.print("Enter the base and height of the prism ");
            float base = sc.nextFloat();
            float height = sc.nextFloat();
            System.out.println();

            volume = base * height;
            System.out.println("The volume of the prism is " + volume);

        } else if (operation == 3) {
            System.out.print("Enter the radius and height of the cylinder");
            float radius = sc.nextFloat();
            float height = sc.nextFloat();
            System.out.println();

            volume = 3.14f * radius * radius * height;
            System.out.println("The volume of the cylinder is " + volume);

        } else if (operation == 4) {
            System.out.print("Enter the radius   of the sphere");
            float radius = sc.nextFloat();
            System.out.println();

            volume = 4 / 3f * 3.14f * radius * radius * radius;
            System.out.println("The volume of the sphere is " + volume);

        } else if (operation == 5) {
            System.out.print("Enter the base , width  and height of the pyramid ");
            float base = sc.nextFloat();
            float width = sc.nextFloat();
            float height = sc.nextFloat();
            System.out.println();

            volume = (base * width * height) / 3;
            System.out.println("The volume of the pyramid is " + volume);
        } else if (operation == 6) {
            System.out.print("Enter the radius and height of the cylinder");
            float radius = sc.nextFloat();
            float height = sc.nextFloat();
            System.out.println();

            volume = 2 * 3.14f * radius * height;
            System.out.println("The curved surface area of cone is : " + volume);
        } else if (operation == 7) {
            System.out.println("Enter the side of the cube ");
            float side = sc.nextFloat();

            volume = 6 * side * side;
            System.out.println("The total surface area of the cube is " + volume);
        } else {
            System.out.println("Invalid option please enter the valid option");
        }

    }
}
