package com.Pawan.OOPS.Lecture1;

public class Main {
    public static void main(String[] args) {

//        creating a instance of the class (i.e object )
        Student pawan = new Student();
        /* Description of the above line
        1. pawan is the reference variable which is located in stack memory but will be pointing
           to the object in the heap memory
        2. the "new" keyword is used to dynamically allocate the memory for the object
        3. Student() is a default constructor called when the object is created
         */

        pawan.roll = 23;
//        pawan.name = "P pawan Kumar";
        pawan.percentage = 93.5f;

        System.out.println(pawan.roll);
        System.out.println(pawan.name);


    }
}
// creating a class
 class Student{
    int roll;
    String name = "Pawan";
    float percentage;  // these are instance variable
 }